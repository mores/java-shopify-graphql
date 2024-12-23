package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountAutomaticBxgyInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates an existing
 * [buy X get Y discount (BXGY)](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y)
 * that's automatically applied on a cart and at checkout.
 *   
 * > Note:
 * > To update code discounts, use the
 * [`discountCodeBxgyUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountCodeBxgyUpdate)
 * mutation instead.
 */
public class DiscountAutomaticBxgyUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountAutomaticBxgyUpdateGraphQLQuery(String id,
      DiscountAutomaticBxgyInput automaticBxgyDiscount, String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (automaticBxgyDiscount != null || fieldsSet.contains("automaticBxgyDiscount")) {
        getInput().put("automaticBxgyDiscount", automaticBxgyDiscount);
    }
  }

  public DiscountAutomaticBxgyUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountAutomaticBxgyUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountAutomaticBxgyInput automaticBxgyDiscount;

    private String queryName;

    public DiscountAutomaticBxgyUpdateGraphQLQuery build() {
      return new DiscountAutomaticBxgyUpdateGraphQLQuery(id, automaticBxgyDiscount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the automatic BXGY discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the automatic BXGY discount.
     */
    public Builder automaticBxgyDiscount(DiscountAutomaticBxgyInput automaticBxgyDiscount) {
      this.automaticBxgyDiscount = automaticBxgyDiscount;
      this.fieldsSet.add("automaticBxgyDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
