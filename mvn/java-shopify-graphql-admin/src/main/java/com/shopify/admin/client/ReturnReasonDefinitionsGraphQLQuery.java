package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.ReturnReasonDefinitionSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Returns the full library of available return reason definitions.
 *   
 * Use this query to retrieve the standardized return reasons available for creating returns.
 * Filter by IDs or handles to get specific definitions.
 *   
 * Only non-deleted reasons should be shown to customers when creating new returns.
 * Deleted reasons have been replaced with better alternatives and are no longer recommended.
 * However, they remain valid options and may still appear on existing returns.
 */
public class ReturnReasonDefinitionsGraphQLQuery extends GraphQLQuery {
  public ReturnReasonDefinitionsGraphQLQuery(List<String> ids, List<String> handles, Integer first,
      String after, Integer last, String before, Boolean reverse,
      ReturnReasonDefinitionSortKeys sortKey, String query, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (ids != null || fieldsSet.contains("ids")) {
        getInput().put("ids", ids);
    }if (handles != null || fieldsSet.contains("handles")) {
        getInput().put("handles", handles);
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
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }
  }

  public ReturnReasonDefinitionsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "returnReasonDefinitions";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> ids;

    private List<String> handles;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private ReturnReasonDefinitionSortKeys sortKey;

    private String query;

    private String queryName;

    public ReturnReasonDefinitionsGraphQLQuery build() {
      return new ReturnReasonDefinitionsGraphQLQuery(ids, handles, first, after, last, before, reverse, sortKey, query, queryName, fieldsSet);
               
    }

    /**
     * A list of return reason definition IDs to filter by.
     */
    public Builder ids(List<String> ids) {
      this.ids = ids;
      this.fieldsSet.add("ids");
      return this;
    }

    /**
     * A list of return reason definition handles to filter by.
     */
    public Builder handles(List<String> handles) {
      this.handles = handles;
      this.fieldsSet.add("handles");
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

    /**
     * Sort the underlying list using a key. If your query is slow or returns an
     * error, then [try specifying a sort key that matches the field used in the search](https://shopify.dev/api/usage/pagination-graphql#search-performance-considerations).
     */
    public Builder sortKey(ReturnReasonDefinitionSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | deleted | boolean | Filter by whether the return reason has been removed from taxonomy. |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | name | string | Filter by name. |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
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
