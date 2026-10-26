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
 * Returns a [`PriceList`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PriceList) by ID. You can use price lists to specify either fixed prices or adjusted
 * relative prices that override initial
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) prices.
 *   
 * Price lists enable contextual pricing for the [`Catalog`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Catalog)
 * they are associated to. Each price list can define fixed prices for specific [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * objects or percentage-based adjustments relative to other prices.
 */
public class PriceListGraphQLQuery extends GraphQLQuery {
  public PriceListGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public PriceListGraphQLQuery(String id, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public PriceListGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "priceList";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private String queryName;

    public PriceListGraphQLQuery build() {
      return new PriceListGraphQLQuery(id, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the `PriceList` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The ID of the `PriceList` to return.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
