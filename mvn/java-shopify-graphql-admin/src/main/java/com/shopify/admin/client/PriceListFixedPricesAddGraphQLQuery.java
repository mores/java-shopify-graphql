package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PriceListPriceInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates or updates fixed prices on a [`PriceList`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PriceList).
 * Use this mutation to set specific prices for [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * objects that override the price list's default percentage-based adjustments.
 *   
 * When you add fixed prices, the mutation replaces any existing fixed prices for those variants on the price list.
 */
public class PriceListFixedPricesAddGraphQLQuery extends GraphQLQuery {
  public PriceListFixedPricesAddGraphQLQuery(String priceListId, List<PriceListPriceInput> prices,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (prices != null || fieldsSet.contains("prices")) {
        getInput().put("prices", prices);
    }
  }

  public PriceListFixedPricesAddGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListFixedPricesAdd";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private List<PriceListPriceInput> prices;

    private String queryName;

    public PriceListFixedPricesAddGraphQLQuery build() {
      return new PriceListFixedPricesAddGraphQLQuery(priceListId, prices, queryName, fieldsSet);
               
    }

    /**
     * The ID of the price list to which the fixed prices will be added or updated.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * The list of fixed prices to add or update in the price list.
     */
    public Builder prices(List<PriceListPriceInput> prices) {
      this.prices = prices;
      this.fieldsSet.add("prices");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
