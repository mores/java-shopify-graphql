package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Adds a locale for a shop. The newly added locale is in the unpublished state.
 */
public class ShopLocaleEnableGraphQLQuery extends GraphQLQuery {
  public ShopLocaleEnableGraphQLQuery(String locale, List<String> marketWebPresenceIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (locale != null || fieldsSet.contains("locale")) {
        getInput().put("locale", locale);
    }if (marketWebPresenceIds != null || fieldsSet.contains("marketWebPresenceIds")) {
        getInput().put("marketWebPresenceIds", marketWebPresenceIds);
    }
  }

  public ShopLocaleEnableGraphQLQuery(String locale, List<String> marketWebPresenceIds,
      String queryName, Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (locale != null || fieldsSet.contains("locale")) {
        getInput().put("locale", locale);
    }if (marketWebPresenceIds != null || fieldsSet.contains("marketWebPresenceIds")) {
        getInput().put("marketWebPresenceIds", marketWebPresenceIds);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopLocaleEnableGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "shopLocaleEnable";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String locale;

    private List<String> marketWebPresenceIds;

    private String queryName;

    public ShopLocaleEnableGraphQLQuery build() {
      return new ShopLocaleEnableGraphQLQuery(locale, marketWebPresenceIds, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * ISO code of the locale to enable.
     */
    public Builder locale(String locale) {
      this.locale = locale;
      this.fieldsSet.add("locale");
      return this;
    }

    /**
     * ISO code of the locale to enable.
     */
    public Builder localeReference(String variableRef) {
      this.variableReferences.put("locale", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("locale");
      return this;
    }

    /**
     * The list of markets web presences to add the locale to.
     */
    public Builder marketWebPresenceIds(List<String> marketWebPresenceIds) {
      this.marketWebPresenceIds = marketWebPresenceIds;
      this.fieldsSet.add("marketWebPresenceIds");
      return this;
    }

    /**
     * The list of markets web presences to add the locale to.
     */
    public Builder marketWebPresenceIdsReference(String variableRef) {
      this.variableReferences.put("marketWebPresenceIds", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.ListType(new graphql.language.NonNullType(new graphql.language.TypeName("ID")))).build());
      this.fieldsSet.add("marketWebPresenceIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
