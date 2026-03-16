package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.DiscountAutomaticFreeShippingInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates existing automatic free shipping discounts, allowing merchants to
 * modify promotion criteria, shipping destinations, and eligibility requirements
 * without recreating the entire discount structure.
 *   
 * For example, extending a holiday free shipping promotion to include additional
 * countries, adjusting the minimum order value threshold, or expanding customer
 * eligibility to include new segments.
 *   
 * Use `DiscountAutomaticFreeShippingUpdate` to:
 * - Modify shipping discount thresholds and criteria
 * - Expand or restrict geographic availability
 * - Update customer targeting and eligibility rules
 * - Adjust promotion timing and activation periods
 *   
 * Changes take effect immediately for new orders, while the mutation validates
 * all modifications and reports any configuration conflicts through user errors.
 *   
 * Learn more about [managing automatic discounts](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountAutomaticFreeShipping).
 */
public class DiscountAutomaticFreeShippingUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticFreeShippingUpdateGraphQLQuery(String id,
      DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (freeShippingAutomaticDiscount != null || fieldsSet.contains("freeShippingAutomaticDiscount")) {
        getInput().put("freeShippingAutomaticDiscount", freeShippingAutomaticDiscount);
    }
  }

  public DiscountAutomaticFreeShippingUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticFreeShippingUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount;

    private String queryName;

    public DiscountAutomaticFreeShippingUpdateGraphQLQuery build() {
      return new DiscountAutomaticFreeShippingUpdateGraphQLQuery(id, freeShippingAutomaticDiscount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the automatic free shipping discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the automatic free shipping discount.
     */
    public Builder freeShippingAutomaticDiscount(
        DiscountAutomaticFreeShippingInput freeShippingAutomaticDiscount) {
      this.freeShippingAutomaticDiscount = freeShippingAutomaticDiscount;
      this.fieldsSet.add("freeShippingAutomaticDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
