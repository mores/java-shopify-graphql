package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.CountryCode;
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
 * Returns the applicable market for a customer based on where they are in the world.
 */
public class MarketByGeographyGraphQLQuery extends GraphQLQuery {
  public MarketByGeographyGraphQLQuery(CountryCode countryCode, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (countryCode != null || fieldsSet.contains("countryCode")) {
        getInput().put("countryCode", countryCode);
    }
  }

  public MarketByGeographyGraphQLQuery(CountryCode countryCode, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (countryCode != null || fieldsSet.contains("countryCode")) {
        getInput().put("countryCode", countryCode);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public MarketByGeographyGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "marketByGeography";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private CountryCode countryCode;

    private String queryName;

    public MarketByGeographyGraphQLQuery build() {
      return new MarketByGeographyGraphQLQuery(countryCode, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The code for the country where the customer is.
     */
    public Builder countryCode(CountryCode countryCode) {
      this.countryCode = countryCode;
      this.fieldsSet.add("countryCode");
      return this;
    }

    /**
     * The code for the country where the customer is.
     */
    public Builder countryCodeReference(String variableRef) {
      this.variableReferences.put("countryCode", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("CountryCode"))).build());
      this.fieldsSet.add("countryCode");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
