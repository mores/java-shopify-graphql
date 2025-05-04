package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Returns delivery promise participants.
 */
public class DeliveryPromiseParticipantsGraphQLQuery extends GraphQLQuery {
  public DeliveryPromiseParticipantsGraphQLQuery(List<String> ownerIds, String brandedPromiseHandle,
      Integer first, String after, Integer last, String before, Boolean reverse, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (ownerIds != null || fieldsSet.contains("ownerIds")) {
        getInput().put("ownerIds", ownerIds);
    }if (brandedPromiseHandle != null || fieldsSet.contains("brandedPromiseHandle")) {
        getInput().put("brandedPromiseHandle", brandedPromiseHandle);
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

  public DeliveryPromiseParticipantsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "deliveryPromiseParticipants";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> ownerIds;

    private String brandedPromiseHandle;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private String queryName;

    public DeliveryPromiseParticipantsGraphQLQuery build() {
      return new DeliveryPromiseParticipantsGraphQLQuery(ownerIds, brandedPromiseHandle, first, after, last, before, reverse, queryName, fieldsSet);
               
    }

    /**
     * The product variant ID to filter by.
     */
    public Builder ownerIds(List<String> ownerIds) {
      this.ownerIds = ownerIds;
      this.fieldsSet.add("ownerIds");
      return this;
    }

    /**
     * The branded promise handle to filter by.
     */
    public Builder brandedPromiseHandle(String brandedPromiseHandle) {
      this.brandedPromiseHandle = brandedPromiseHandle;
      this.fieldsSet.add("brandedPromiseHandle");
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
