package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes)
 * by its discount code. The search is case-insensitive, enabling you to find
 * discounts regardless of how customers enter the code.
 *   
 * Returns a [`DiscountCodeNode`](https://shopify.dev/docs/api/admin-graphql/latest/objects/DiscountCodeNode) that contains the underlying discount details, which could be a basic [amount off discount](https://help.shopify.com/manual/discounts/discount-types/percentage-fixed-amount),
 * a ["Buy X Get Y" (BXGY) discount](https://help.shopify.com/manual/discounts/discount-types/buy-x-get-y),
 * a [free shipping discount](https://help.shopify.com/manual/discounts/discount-types/free-shipping),
 * or an [app-provided discount](https://help.shopify.com/manual/discounts/discount-types/discounts-with-apps).
 *   
 * Learn more about working with [Shopify's discount model](https://shopify.dev/docs/apps/build/discounts).
 */
public class CodeDiscountNodeByCodeGraphQLQuery extends GraphQLQuery {
  public CodeDiscountNodeByCodeGraphQLQuery(String code, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (code != null || fieldsSet.contains("code")) {
        getInput().put("code", code);
    }
  }

  public CodeDiscountNodeByCodeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "codeDiscountNodeByCode";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String code;

    private String queryName;

    public CodeDiscountNodeByCodeGraphQLQuery build() {
      return new CodeDiscountNodeByCodeGraphQLQuery(code, queryName, fieldsSet);
               
    }

    /**
     * The case-insensitive code of the `DiscountCodeNode` to return.
     */
    public Builder code(String code) {
      this.code = code;
      this.fieldsSet.add("code");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
