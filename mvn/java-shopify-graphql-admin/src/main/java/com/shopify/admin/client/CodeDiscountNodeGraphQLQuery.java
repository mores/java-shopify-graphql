package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a [code discount](https://help.shopify.com/manual/discounts/discount-types#discount-codes) resource by ID.
 */
public class CodeDiscountNodeGraphQLQuery extends GraphQLQuery {
  public CodeDiscountNodeGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public CodeDiscountNodeGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "codeDiscountNode";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public CodeDiscountNodeGraphQLQuery build() {
      return new CodeDiscountNodeGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the `DiscountCodeNode` to return.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
