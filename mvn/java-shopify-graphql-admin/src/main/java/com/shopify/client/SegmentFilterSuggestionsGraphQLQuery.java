package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * A list of filter suggestions associated with a segment. A segment is a group
 * of members (commonly customers) that meet specific criteria.
 */
public class SegmentFilterSuggestionsGraphQLQuery extends GraphQLQuery {
  public SegmentFilterSuggestionsGraphQLQuery(String search, int first, String after,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (search != null || fieldsSet.contains("search")) {
        getInput().put("search", search);
    }getInput().put("first", first);                   if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }
  }

  public SegmentFilterSuggestionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "segmentFilterSuggestions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String search;

    private int first;

    private String after;

    private String queryName;

    public SegmentFilterSuggestionsGraphQLQuery build() {
      return new SegmentFilterSuggestionsGraphQLQuery(search, first, after, queryName, fieldsSet);
               
    }

    /**
     * Returns the elements of a list by keyword or term.
     */
    public Builder search(String search) {
      this.search = search;
      this.fieldsSet.add("search");
      return this;
    }

    /**
     * The first `n` elements from the [paginated list](https://shopify.dev/api/usage/pagination-graphql).
     */
    public Builder first(int first) {
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

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
