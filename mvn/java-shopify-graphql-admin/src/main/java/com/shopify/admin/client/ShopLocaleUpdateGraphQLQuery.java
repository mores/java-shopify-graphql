package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ShopLocaleInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Updates a locale for a shop.
 */
public class ShopLocaleUpdateGraphQLQuery extends GraphQLQuery {
  public ShopLocaleUpdateGraphQLQuery(String locale, ShopLocaleInput shopLocale, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locale != null || fieldsSet.contains("locale")) {
        getInput().put("locale", locale);
    }if (shopLocale != null || fieldsSet.contains("shopLocale")) {
        getInput().put("shopLocale", shopLocale);
    }
  }

  public ShopLocaleUpdateGraphQLQuery(String locale, ShopLocaleInput shopLocale, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (locale != null || fieldsSet.contains("locale")) {
        getInput().put("locale", locale);
    }if (shopLocale != null || fieldsSet.contains("shopLocale")) {
        getInput().put("shopLocale", shopLocale);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopLocaleUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopLocaleUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String locale;

    private ShopLocaleInput shopLocale;

    private String queryName;

    public ShopLocaleUpdateGraphQLQuery build() {
      return new ShopLocaleUpdateGraphQLQuery(locale, shopLocale, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * ISO code of the locale to update.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      this.fieldsSet.add("locale");
      return this;
    }

    /**
     * ISO code of the locale to update.
     */
    public Builder localeReference(String variableRef) {
      this.variableReferences.put("locale", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("locale");
      return this;
    }

    /**
     * Specifies the input fields for a shop locale.
     */
    public Builder shopLocale(ShopLocaleInput shopLocale) {
      this.shopLocale = shopLocale;
      this.fieldsSet.add("shopLocale");
      return this;
    }

    /**
     * Specifies the input fields for a shop locale.
     */
    public Builder shopLocaleReference(String variableRef) {
      this.variableReferences.put("shopLocale", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ShopLocaleInput"))).build());
      this.fieldsSet.add("shopLocale");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
