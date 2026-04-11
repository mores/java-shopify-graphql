package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.PriceListProductPriceInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Sets or removes fixed prices for all variants of a
 * [`Product`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Product) on a [`PriceList`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PriceList).
 * Simplifies pricing management when all variants of a product should have the
 * same price on a price list, rather than setting individual variant prices.
 *   
 * When you add a fixed price for a product, all its [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * objects receive the same price on the price list. When you remove a product's
 * fixed prices, all variant prices revert to the price list's adjustment rules.
 */
public class PriceListFixedPricesByProductUpdateGraphQLQuery extends GraphQLQuery {
  public PriceListFixedPricesByProductUpdateGraphQLQuery(
      List<PriceListProductPriceInput> pricesToAdd, List<String> pricesToDeleteByProductIds,
      String priceListId, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (pricesToAdd != null || fieldsSet.contains("pricesToAdd")) {
        getInput().put("pricesToAdd", pricesToAdd);
    }if (pricesToDeleteByProductIds != null || fieldsSet.contains("pricesToDeleteByProductIds")) {
        getInput().put("pricesToDeleteByProductIds", pricesToDeleteByProductIds);
    }if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }
  }

  public PriceListFixedPricesByProductUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListFixedPricesByProductUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<PriceListProductPriceInput> pricesToAdd;

    private List<String> pricesToDeleteByProductIds;

    private String priceListId;

    private String queryName;

    public PriceListFixedPricesByProductUpdateGraphQLQuery build() {
      return new PriceListFixedPricesByProductUpdateGraphQLQuery(pricesToAdd, pricesToDeleteByProductIds, priceListId, queryName, fieldsSet);
               
    }

    /**
     * A list of `PriceListProductPriceInput` that identifies which products to update the fixed prices for.
     */
    public Builder pricesToAdd(List<PriceListProductPriceInput> pricesToAdd) {
      this.pricesToAdd = pricesToAdd;
      this.fieldsSet.add("pricesToAdd");
      return this;
    }

    /**
     * A list of product IDs that identifies which products to remove the fixed prices for.
     */
    public Builder pricesToDeleteByProductIds(List<String> pricesToDeleteByProductIds) {
      this.pricesToDeleteByProductIds = pricesToDeleteByProductIds;
      this.fieldsSet.add("pricesToDeleteByProductIds");
      return this;
    }

    /**
     * The price list to update the prices for.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
