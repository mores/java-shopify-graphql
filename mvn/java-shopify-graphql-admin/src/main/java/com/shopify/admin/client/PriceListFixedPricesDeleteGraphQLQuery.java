package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Deletes specific fixed prices from a price list using a product variant ID.
 * You can use the `priceListFixedPricesDelete` mutation to delete a set of fixed
 * prices from a price list. After deleting the set of fixed prices from the
 * price list, the price of each product variant reverts to the original price
 * that was determined by the price list adjustment.
 */
public class PriceListFixedPricesDeleteGraphQLQuery extends GraphQLQuery {
  public PriceListFixedPricesDeleteGraphQLQuery(String priceListId, List<String> variantIds,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (variantIds != null || fieldsSet.contains("variantIds")) {
        getInput().put("variantIds", variantIds);
    }
  }

  public PriceListFixedPricesDeleteGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListFixedPricesDelete";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private List<String> variantIds;

    private String queryName;

    public PriceListFixedPricesDeleteGraphQLQuery build() {
      return new PriceListFixedPricesDeleteGraphQLQuery(priceListId, variantIds, queryName, fieldsSet);
               
    }

    /**
     * The ID of the price list from which the fixed prices will be removed.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * A list of product variant IDs whose fixed prices will be removed from the price list.
     */
    public Builder variantIds(List<String> variantIds) {
      this.variantIds = variantIds;
      this.fieldsSet.add("variantIds");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
