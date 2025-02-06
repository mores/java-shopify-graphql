package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.DiscountCodeAppInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Updates a code discount, where the discount type is provided by an app
 * extension that uses [Shopify
 * Functions](https://shopify.dev/docs/apps/build/functions). Use this mutation
 * when you need advanced, custom, or dynamic discount capabilities that aren't
 * supported by [Shopify's native discount
 * types](https://help.shopify.com/manual/discounts/discount-types).
 *   
 * > Note:
 * > To update automatic discounts, use [`discountAutomaticAppUpdate`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/discountAutomaticAppUpdate).
 */
public class DiscountCodeAppUpdateGraphQLQuery extends GraphQLQuery {
  public DiscountCodeAppUpdateGraphQLQuery(String id, DiscountCodeAppInput codeAppDiscount,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (codeAppDiscount != null || fieldsSet.contains("codeAppDiscount")) {
        getInput().put("codeAppDiscount", codeAppDiscount);
    }
  }

  public DiscountCodeAppUpdateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "discountCodeAppUpdate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private DiscountCodeAppInput codeAppDiscount;

    private String queryName;

    public DiscountCodeAppUpdateGraphQLQuery build() {
      return new DiscountCodeAppUpdateGraphQLQuery(id, codeAppDiscount, queryName, fieldsSet);
               
    }

    /**
     * The ID of the discount to update.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The input fields required to update the discount.
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
