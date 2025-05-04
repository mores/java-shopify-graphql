package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes translations.
 */
public class TranslationsRemoveGraphQLQuery extends GraphQLQuery {
  public TranslationsRemoveGraphQLQuery(String resourceId, List<String> translationKeys,
      List<String> locales, List<String> marketIds, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (resourceId != null || fieldsSet.contains("resourceId")) {
        getInput().put("resourceId", resourceId);
    }if (translationKeys != null || fieldsSet.contains("translationKeys")) {
        getInput().put("translationKeys", translationKeys);
    }if (locales != null || fieldsSet.contains("locales")) {
        getInput().put("locales", locales);
    }if (marketIds != null || fieldsSet.contains("marketIds")) {
        getInput().put("marketIds", marketIds);
    }
  }

  public TranslationsRemoveGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "translationsRemove";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String resourceId;

    private List<String> translationKeys;

    private List<String> locales;

    private List<String> marketIds;

    private String queryName;

    public TranslationsRemoveGraphQLQuery build() {
      return new TranslationsRemoveGraphQLQuery(resourceId, translationKeys, locales, marketIds, queryName, fieldsSet);
               
    }

    /**
     * ID of the translatable resource for which translations are being deleted.
     */
    public Builder resourceId(String resourceId) {
      this.resourceId = resourceId;
      this.fieldsSet.add("resourceId");
      return this;
    }

    /**
     * The list of translation keys.
     */
    public Builder translationKeys(List<String> translationKeys) {
      this.translationKeys = translationKeys;
      this.fieldsSet.add("translationKeys");
      return this;
    }

    /**
     * The list of translation locales. Only locales returned in `shopLocales` are valid.
     */
    public Builder locales(List<String> locales) {
      this.locales = locales;
      this.fieldsSet.add("locales");
      return this;
    }

    /**
     * The list of market IDs.
     */
    public Builder marketIds(List<String> marketIds) {
      this.marketIds = marketIds;
      this.fieldsSet.add("marketIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
