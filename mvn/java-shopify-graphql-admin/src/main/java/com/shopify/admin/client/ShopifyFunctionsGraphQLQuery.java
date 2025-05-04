package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the Shopify Functions owned by the querying API client installed on the shop.
 */
public class ShopifyFunctionsGraphQLQuery extends GraphQLQuery {
  public ShopifyFunctionsGraphQLQuery(String apiType, Boolean useCreationUi, Integer first,
      String after, Integer last, String before, Boolean reverse, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (apiType != null || fieldsSet.contains("apiType")) {
        getInput().put("apiType", apiType);
    }if (useCreationUi != null || fieldsSet.contains("useCreationUi")) {
        getInput().put("useCreationUi", useCreationUi);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }
  }

  public ShopifyFunctionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "shopifyFunctions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String apiType;

    private Boolean useCreationUi;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private String queryName;

    public ShopifyFunctionsGraphQLQuery build() {
      return new ShopifyFunctionsGraphQLQuery(apiType, useCreationUi, first, after, last, before, reverse, queryName, fieldsSet);
               
    }

    /**
     * Filter the functions by the API type.
     */
    public Builder apiType(String apiType) {
      this.apiType = apiType;
      this.fieldsSet.add("apiType");
      return this;
    }

    /**
     * Filter the functions by whether or not the function uses the creation UI in the Admin.
     */
    public Builder useCreationUi(Boolean useCreationUi) {
      this.useCreationUi = useCreationUi;
      this.fieldsSet.add("useCreationUi");
      return this;
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * The elements that come after the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * The last `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * The elements that come before the specified [cursor](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
