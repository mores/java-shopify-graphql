package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountCodeBasicInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates an [amount off discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount)
 * that's applied on a cart and at checkout when a customer enters a code. Amount
 * off discounts can be a percentage off or a fixed amount off.
 *   
 * > Note:
 * > To update discounts that are automatically applied on a cart and at
 * checkout, use the [`discountAutomaticBasicUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountAutomaticBasicUpdate) mutation.
 */
public class DiscountCodeBasicUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeBasicUpdateGraphQLQuery(String id, DiscountCodeBasicInput basicCodeDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (basicCodeDiscount != null || fieldsSet.contains("basicCodeDiscount")) {
        getInput().put("basicCodeDiscount", basicCodeDiscount);
    }
  }

  public DiscountCodeBasicUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeBasicUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountCodeBasicInput basicCodeDiscount;

    private String queryName;

    public DiscountCodeBasicUpdateGraphQLQuery build() {
      return new DiscountCodeBasicUpdateGraphQLQuery(id, basicCodeDiscount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the discount code to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input data used to update the discount code.
     */
    public Builder basicCodeDiscount(DiscountCodeBasicInput basicCodeDiscount) {
      this.basicCodeDiscount = basicCodeDiscount;
      this.fieldsSet.add("basicCodeDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
