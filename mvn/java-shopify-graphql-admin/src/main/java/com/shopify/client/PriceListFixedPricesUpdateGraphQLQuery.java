package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.PriceListPriceInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Updates fixed prices on a price list. You can use the
 * `priceListFixedPricesUpdate` mutation to set a fixed price for specific
 * product variants or to delete prices for variants associated with the price list.
 */
public class PriceListFixedPricesUpdateGraphQLQuery extends GraphQLQuery {
  public PriceListFixedPricesUpdateGraphQLQuery(String priceListId,
      List<PriceListPriceInput> pricesToAdd, List<String> variantIdsToDelete, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (pricesToAdd != null || fieldsSet.contains("pricesToAdd")) {
        getInput().put("pricesToAdd", pricesToAdd);
    }if (variantIdsToDelete != null || fieldsSet.contains("variantIdsToDelete")) {
        getInput().put("variantIdsToDelete", variantIdsToDelete);
    }
  }

  public PriceListFixedPricesUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "priceListFixedPricesUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private List<PriceListPriceInput> pricesToAdd;

    private List<String> variantIdsToDelete;

    private String queryName;

    public PriceListFixedPricesUpdateGraphQLQuery build() {
      return new PriceListFixedPricesUpdateGraphQLQuery(priceListId, pricesToAdd, variantIdsToDelete, queryName, fieldsSet);
               
    }

    /**
     * The price list that the prices will be updated against.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * The fixed prices to add.
     */
    public Builder pricesToAdd(List<PriceListPriceInput> pricesToAdd) {
      this.pricesToAdd = pricesToAdd;
      this.fieldsSet.add("pricesToAdd");
      return this;
    }

    /**
     * A list of product variant IDs to remove from the price list.
     */
    public Builder variantIdsToDelete(List<String> variantIdsToDelete) {
      this.variantIdsToDelete = variantIdsToDelete;
      this.fieldsSet.add("variantIdsToDelete");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
