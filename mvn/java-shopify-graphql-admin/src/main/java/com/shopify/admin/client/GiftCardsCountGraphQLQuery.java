package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * The total number of gift cards issued for the shop. Limited to a maximum of 10000.
 */
public class GiftCardsCountGraphQLQuery extends GraphQLQuery {
  public GiftCardsCountGraphQLQuery(String query, String savedSearchId, String queryName,
      Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }
  }

  public GiftCardsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "giftCardsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String savedSearchId;

    private String queryName;

    public GiftCardsCountGraphQLQuery build() {
      return new GiftCardsCountGraphQLQuery(query, savedSearchId, queryName, fieldsSet);
               
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Searched fields: code. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | balance_status | string | | - `full`<br/> - `partial`<br/> - `empty`<br/>
     * - `full_or_partial` | | - `balance_status:full` |
     * | created_at | time | | | | - `created_at:>=2020-01-01T12:00:00Z` |
     * | expires_on | date | | | | - `expires_on:>=2020-01-01` |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | initial_value | string | | | | - `initial_value:>=100` |
     * | source | string | | - `manual`<br/> - `purchased`<br/> - `api_client` | | - `source:manual` |
     * | status | string | | - `disabled`<br/> - `enabled`<br/> - `expired`<br/> -
     * `expiring` | | - `status:disabled OR status:expired` |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * The ID of an existing saved search.
     * The search’s query string is used as the query argument.
     * Refer to the [`SavedSearch`](https://shopify.dev/api/admin-graphql/latest/objects/savedsearch) object.
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
