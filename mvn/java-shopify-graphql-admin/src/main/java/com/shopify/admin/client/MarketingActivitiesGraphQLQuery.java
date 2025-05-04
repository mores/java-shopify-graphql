package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.MarketingActivitySortKeys;
import com.shopify.admin.types.UTMInput;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A list of marketing activities associated with the marketing app.
 */
public class MarketingActivitiesGraphQLQuery extends GraphQLQuery {
  public MarketingActivitiesGraphQLQuery(List<String> marketingActivityIds, List<String> remoteIds,
      UTMInput utm, Integer first, String after, Integer last, String before, Boolean reverse,
      MarketingActivitySortKeys sortKey, String query, String savedSearchId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (marketingActivityIds != null || fieldsSet.contains("marketingActivityIds")) {
        getInput().put("marketingActivityIds", marketingActivityIds);
    }if (remoteIds != null || fieldsSet.contains("remoteIds")) {
        getInput().put("remoteIds", remoteIds);
    }if (utm != null || fieldsSet.contains("utm")) {
        getInput().put("utm", utm);
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
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public MarketingActivitiesGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "marketingActivities";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<String> marketingActivityIds;

    private List<String> remoteIds;

    private UTMInput utm;

    private Integer first;

    private String after;

    private Integer last;

    private String before;

    private Boolean reverse;

    private MarketingActivitySortKeys sortKey;

    private String query;

    private String savedSearchId;

    private String queryName;

    public MarketingActivitiesGraphQLQuery build() {
      return new MarketingActivitiesGraphQLQuery(marketingActivityIds, remoteIds, utm, first, after, last, before, reverse, sortKey, query, savedSearchId, queryName, fieldsSet);
               
    }

    /**
     * The list of marketing activity IDs to filter by.
     */
    public Builder marketingActivityIds(List<String> marketingActivityIds) {
      this.marketingActivityIds = marketingActivityIds;
      this.fieldsSet.add("marketingActivityIds");
      return this;
    }

    /**
     * The list of remote IDs associated with marketing activities to filter by.
     */
    public Builder remoteIds(List<String> remoteIds) {
      this.remoteIds = remoteIds;
      this.fieldsSet.add("remoteIds");
      return this;
    }

    /**
     * The UTM parameters associated with marketing activities to filter by.
     */
    public Builder utm(UTMInput utm) {
      this.utm = utm;
      this.fieldsSet.add("utm");
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
    public Builder sortKey(MarketingActivitySortKeys sortKey) {
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
     * | app_id | id |
     * | app_name | string | A comma-separated list of app names. |
     * | created_at | time |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | marketing_campaign_id | id |
     * | scheduled_to_end_at | time |
     * | scheduled_to_start_at | time |
     * | tactic | string |
     * | title | string |
     * | updated_at | time |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The ID of a [saved search](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch#field-id).
     * The search’s query string is used as the query argument.
     */
    public Builder savedSearchId(String savedSearchId) {
      this.savedSearchId = savedSearchId;
      this.fieldsSet.add("savedSearchId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
