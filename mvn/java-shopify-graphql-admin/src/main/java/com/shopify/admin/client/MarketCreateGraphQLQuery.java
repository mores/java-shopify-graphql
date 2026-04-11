package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketCreateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a [`Market`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Market)
 * to deliver customized shopping experiences. Markets define various aspects of
 * the buyer experience including pricing, product availability, custom content,
 * inventory and fulfillment priorities, and payment methods.
 *   
 * Define conditions to match buyers by region, company location, retail
 * location, or other criteria. Configure [`MarketCurrencySettings`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MarketCurrencySettings)
 * to control currency behavior. Set [`MarketPriceInclusions`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MarketPriceInclusions)
 * to determine tax and duty display. Assign [`Catalog`](https://shopify.dev/docs/api/admin-graphql/latest/interfaces/Catalog) objects and [`MarketWebPresence`](https://shopify.dev/docs/api/admin-graphql/latest/objects/MarketWebPresence)
 * configurations to control product availability and SEO strategy.
 *   
 * Learn more about [Shopify Markets](https://shopify.dev/docs/apps/build/markets).
 */
public class MarketCreateGraphQLQuery extends GraphQLQuery {
  public MarketCreateGraphQLQuery(MarketCreateInput input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public MarketCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "marketCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private MarketCreateInput input;

    private String queryName;

    public MarketCreateGraphQLQuery build() {
      return new MarketCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The properties of the new market.
     */
    public Builder input(MarketCreateInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
