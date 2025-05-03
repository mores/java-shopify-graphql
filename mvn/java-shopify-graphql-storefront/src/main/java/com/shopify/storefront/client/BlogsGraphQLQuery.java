package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.BlogSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * List of the shop's blogs.
 */
public class BlogsGraphQLQuery extends GraphQLQuery {
  public BlogsGraphQLQuery(String after, String before, Integer first, Integer last, String query,
      Boolean reverse, BlogSortKeys sortKey, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }
  }

  public BlogsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "blogs";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String after;

    private String before;

    private Integer first;

    private Integer last;

    private String query;

    private Boolean reverse;

    private BlogSortKeys sortKey;

    private String queryName;

    public BlogsGraphQLQuery build() {
      return new BlogsGraphQLQuery(after, before, first, last, query, reverse, sortKey, queryName, fieldsSet);
               
    }

    /**
     * Returns the elements that come after the specified cursor.
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
      return this;
    }

    /**
     * Returns the elements that come before the specified cursor.
     */
    public Builder before(String before) {
      this.before = before;
      this.fieldsSet.add("before");
      return this;
    }

    /**
     * Returns up to the first `n` elements from the list.
     */
    public Builder first(Integer first) {
      this.first = first;
      this.fieldsSet.add("first");
      return this;
    }

    /**
     * Returns up to the last `n` elements from the list.
     */
    public Builder last(Integer last) {
      this.last = last;
      this.fieldsSet.add("last");
      return this;
    }

    /**
     * Apply one or multiple filters to the query.
     * | name | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- |
     * | created_at |
     * | handle |
     * | title |
     * | updated_at |
     * Refer to the detailed [search
     * syntax](https://shopify.dev/api/usage/search-syntax) for more information
     * about using filters.
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
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

    /**
     * Sort the underlying list by the given key.
     */
    public Builder sortKey(BlogSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
