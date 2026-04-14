package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.QuantityPricingByVariantUpdateInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates quantity pricing on a [`PriceList`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PriceList) for specific [`ProductVariant`](https://shopify.dev/docs/api/admin-graphql/latest/objects/ProductVariant)
 * objects. You can set fixed prices (see [`PriceListPrice`](https://shopify.dev/docs/api/admin-graphql/latest/objects/PriceListPrice)),
 * quantity rules, and quantity price breaks in a single operation.
 *   
 * [`QuantityRule`](https://shopify.dev/docs/api/admin-graphql/latest/objects/QuantityRule) objects define minimum, maximum, and increment constraints for ordering. [`QuantityPriceBreak`](https://shopify.dev/docs/api/admin-graphql/latest/objects/QuantityPriceBreak)
 * objects offer tiered pricing based on purchase volume.
 *   
 * The mutation executes delete operations before create operations and doesn't allow partial updates.
 *   
 * > Note: If any requested change fails, then the mutation doesn't apply any of the changes.
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
