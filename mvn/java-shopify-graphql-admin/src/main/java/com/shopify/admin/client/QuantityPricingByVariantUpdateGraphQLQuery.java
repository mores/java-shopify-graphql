package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.QuantityPricingByVariantUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates quantity pricing on a price list. You can use the
 * `quantityPricingByVariantUpdate` mutation to set fixed prices, quantity rules,
 * and quantity price breaks. This mutation does not allow partial successes. If
 * any of the requested resources fail to update, none of the requested resources
 * will be updated. Delete operations are executed before create operations.
 */
public class QuantityPricingByVariantUpdateGraphQLQuery extends GraphQLQuery {
  public QuantityPricingByVariantUpdateGraphQLQuery(String priceListId,
      QuantityPricingByVariantUpdateInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (priceListId != null || fieldsSet.contains("priceListId")) {
        getInput().put("priceListId", priceListId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public QuantityPricingByVariantUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "quantityPricingByVariantUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String priceListId;

    private QuantityPricingByVariantUpdateInput input;

    private String queryName;

    public QuantityPricingByVariantUpdateGraphQLQuery build() {
      return new QuantityPricingByVariantUpdateGraphQLQuery(priceListId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the price list for which quantity pricing will be updated.
     */
    public Builder priceListId(String priceListId) {
      this.priceListId = priceListId;
      this.fieldsSet.add("priceListId");
      return this;
    }

    /**
     * The input data used to update the quantity pricing in the price list.
     */
    public Builder input(QuantityPricingByVariantUpdateInput input) {
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
