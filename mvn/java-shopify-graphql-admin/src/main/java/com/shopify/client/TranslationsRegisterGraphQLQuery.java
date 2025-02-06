package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.TranslationInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates or updates translations.
 */
public class TranslationsRegisterGraphQLQuery extends GraphQLQuery {
  public TranslationsRegisterGraphQLQuery(String resourceId, List<TranslationInput> translations,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (resourceId != null || fieldsSet.contains("resourceId")) {
        getInput().put("resourceId", resourceId);
    }if (translations != null || fieldsSet.contains("translations")) {
        getInput().put("translations", translations);
    }
  }

  public TranslationsRegisterGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "translationsRegister";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String resourceId;

    private List<TranslationInput> translations;

    private String queryName;

    public TranslationsRegisterGraphQLQuery build() {
      return new TranslationsRegisterGraphQLQuery(resourceId, translations, queryName, fieldsSet);
               
    }

    /**
     * ID of the resource that is being translated.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      this.fieldsSet.add("resourceId");
      return this;
    }

    /**
     * Specifies the input fields for a translation.
     */
    public Builder translations(List<TranslationInput> translations) {
      this.translations = translations;
      this.fieldsSet.add("translations");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
