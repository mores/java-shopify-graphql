package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.SubscriptionFreeShippingDiscountInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a subscription free shipping discount on a subscription draft.
 */
public class SubscriptionDraftFreeShippingDiscountUpdateGraphQLQuery extends GraphQLQuery {
  public SubscriptionDraftFreeShippingDiscountUpdateGraphQLQuery(String draftId, String discountId,
      SubscriptionFreeShippingDiscountInput input, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (draftId != null || fieldsSet.contains("draftId")) {
        getInput().put("draftId", draftId);
    }if (discountId != null || fieldsSet.contains("discountId")) {
        getInput().put("discountId", discountId);
    }if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public SubscriptionDraftFreeShippingDiscountUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "subscriptionDraftFreeShippingDiscountUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String draftId;

    private String discountId;

    private SubscriptionFreeShippingDiscountInput input;

    private String queryName;

    public SubscriptionDraftFreeShippingDiscountUpdateGraphQLQuery build() {
      return new SubscriptionDraftFreeShippingDiscountUpdateGraphQLQuery(draftId, discountId, input, queryName, fieldsSet);
               
    }

    /**
     * The ID of the Subscription Contract draft to update a subscription discount on.
     */
    public Builder draftId(String draftId) {
      this.draftId = draftId;
      this.fieldsSet.add("draftId");
      return this;
    }

    /**
     * The gid of the Subscription Discount to update.
     */
    public Builder discountId(String discountId) {
      this.discountId = discountId;
      this.fieldsSet.add("discountId");
      return this;
    }

    /**
     * The properties to update on the Subscription Free Shipping Discount.
     */
    public Builder input(SubscriptionFreeShippingDiscountInput input) {
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
