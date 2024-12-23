package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountCodeAppInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Creates a code discount. The discount type must be provided by an app
 * extension that uses [Shopify
 * Functions](https://shopify.dev/docs/apps/build/functions). Functions can implement
 * [order](https://shopify.dev/docs/api/functions/reference/order-discounts),
 * [product](https://shopify.dev/docs/api/functions/reference/product-discounts), or [shipping](https://shopify.dev/docs/api/functions/reference/shipping-discounts)
 * discount functions. Use this mutation with Shopify Functions when you need
 * custom logic beyond [Shopify's native discount
 * types](https://help.shopify.com/manual/discounts/discount-types).
 *   
 * For example, use this mutation to create a code discount using an app's
 * "Volume" discount type that applies a percentage off when customers purchase
 * more than the minimum quantity
 * of a product. For an example implementation, refer to [our tutorial](https://shopify.dev/docs/apps/build/discounts/build-discount-function).
 *   
 * > Note:
 * > To create automatic discounts with custom logic, use [`discountAutomaticAppCreate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountAutomaticAppCreate).
 */
public class DiscountCodeAppCreateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeAppCreateGraphQLQuery(DiscountCodeAppInput codeAppDiscount, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (codeAppDiscount != null || fieldsSet.contains("codeAppDiscount")) {
        getInput().put("codeAppDiscount", codeAppDiscount);
    }
  }

  public DiscountCodeAppCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeAppCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private DiscountCodeAppInput codeAppDiscount;

    private String queryName;

    public DiscountCodeAppCreateGraphQLQuery build() {
      return new DiscountCodeAppCreateGraphQLQuery(codeAppDiscount, queryName, fieldsSet);
               
    }

    /**
     * The input data used to create the discount.
     */
    public Builder codeAppDiscount(DiscountCodeAppInput codeAppDiscount) {
      this.codeAppDiscount = codeAppDiscount;
      this.fieldsSet.add("codeAppDiscount");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
