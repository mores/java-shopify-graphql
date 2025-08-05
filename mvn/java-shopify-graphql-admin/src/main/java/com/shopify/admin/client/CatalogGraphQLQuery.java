package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [catalog](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Catalog) by its ID.
 * A catalog represents a list of products with publishing and pricing information,
 * and can be associated with a context, such as a market, company location, or app.
 *   
 * Use the `catalog` query to retrieve information associated with the following workflows:
 *   
 * - Managing product publications across different contexts
 * - Setting up contextual pricing with price lists
 * - Managing market-specific product availability
 * - Configuring B2B customer catalogs
 *   
 * There are several types of catalogs:
 *   
 * - [`MarketCatalog`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MarketCatalog)
 * - [`AppCatalog`](https://shopify.dev/docs/api/admin-graphql/latest/objects/AppCatalog)
 * - [`CompanyLocationCatalog`](https://shopify.dev/docs/api/admin-graphql/latest/objects/CompanyLocationCatalog)
 *   
 * Learn more about [catalogs for different markets](https://shopify.dev/docs/apps/build/markets/catalogs-different-markets).
 */
public class CatalogGraphQLQuery extends GraphQLQuery {
  public CatalogGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CatalogGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "catalog";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CatalogGraphQLQuery build() {
      return new CatalogGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `Catalog` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
