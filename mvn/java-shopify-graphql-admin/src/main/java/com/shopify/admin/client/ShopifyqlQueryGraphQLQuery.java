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
 * Executes a [ShopifyQL query](https://shopify.dev/docs/apps/build/shopifyql) to
 * analyze store data and returns results in a tabular format.
 *   
 * The response includes column metadata with names, data types, and display
 * names, along with the actual data rows. If the query contains syntax errors,
 * then the response provides parse error messages instead of table data.
 *   
 * Read the [ShopifyQL reference
 * documentation](https://shopify.dev/docs/api/shopifyql) for more information on
 * how to write ShopifyQL queries.
 */
public class ShopifyqlQueryGraphQLQuery extends GraphQLQuery {
  public ShopifyqlQueryGraphQLQuery(String query, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public ShopifyqlQueryGraphQLQuery(String query, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public ShopifyqlQueryGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopifyqlQuery";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String query;

    private String queryName;

    public ShopifyqlQueryGraphQLQuery build() {
      return new ShopifyqlQueryGraphQLQuery(query, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * A ShopifyQL query string following the [ShopifyQL
     * syntax](https://shopify.dev/docs/api/shopifyql). Queries must include `FROM`
     * to specify the data source (such as `sales`, `orders`, or `customers`) and
     * `SHOW` to select metrics and dimensions. Example: `FROM sales SHOW
     * total_sales TIMESERIES month SINCE -12m`.
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * A ShopifyQL query string following the [ShopifyQL
     * syntax](https://shopify.dev/docs/api/shopifyql). Queries must include `FROM`
     * to specify the data source (such as `sales`, `orders`, or `customers`) and
     * `SHOW` to select metrics and dimensions. Example: `FROM sales SHOW
     * total_sales TIMESERIES month SINCE -12m`.
     */
    public Builder queryReference(String variableRef) {
      this.variableReferences.put("query", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("String"))).build());
      this.fieldsSet.add("query");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
