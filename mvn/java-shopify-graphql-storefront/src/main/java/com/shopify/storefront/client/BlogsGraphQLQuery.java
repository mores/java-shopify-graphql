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
  public BlogsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, BlogSortKeys sortKey, String query, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
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

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private BlogSortKeys sortKey;

    private String query;

    private String queryName;

    public BlogsGraphQLQuery build() {
      return new BlogsGraphQLQuery(first, after, last, before, reverse, sortKey, query, queryName, fieldsSet);
               
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
     * Returns the elements that come after the specified cursor.
     */
    public Builder after(String after) {
      this.after = after;
      this.fieldsSet.add("after");
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
     * Returns the elements that come before the specified cursor.
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

    /**
     * Sort the underlying list by the given key.
     */
    public Builder sortKey(BlogSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
