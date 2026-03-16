package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
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

    private String query;

    private String queryName;

    public ShopifyqlQueryGraphQLQuery build() {
      return new ShopifyqlQueryGraphQLQuery(query, queryName, fieldsSet);
               
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
