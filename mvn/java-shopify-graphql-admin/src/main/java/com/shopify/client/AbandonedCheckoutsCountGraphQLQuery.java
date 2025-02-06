package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns the count of abandoned checkouts for the given shop. Limited to a maximum of 10000.
 */
public class AbandonedCheckoutsCountGraphQLQuery extends GraphQLQuery {
  public AbandonedCheckoutsCountGraphQLQuery(String query, String savedSearchId, Integer limit,
      String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (query != null || fieldsSet.contains("query")) {
        getInput().put("query", query);
    }if (savedSearchId != null || fieldsSet.contains("savedSearchId")) {
        getInput().put("savedSearchId", savedSearchId);
    }if (limit != null || fieldsSet.contains("limit")) {
        getInput().put("limit", limit);
    }
  }

  public AbandonedCheckoutsCountGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "abandonedCheckoutsCount";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String query;

    private String savedSearchId;

    private Integer limit;

    private String queryName;

    public AbandonedCheckoutsCountGraphQLQuery build() {
      return new AbandonedCheckoutsCountGraphQLQuery(query, savedSearchId, limit, queryName, fieldsSet);
               
    }

    /**
     * A filter made up of terms, connectives, modifiers, and comparators.
     * | name | type | description | acceptable_values | default_value | example_use |
     * | ---- | ---- | ---- | ---- | ---- | ---- |
     * | default | string | Filter by a case-insensitive search of multiple fields
     * in a document. | | | - `query=Bob Norman`<br/> - `query=title:green hoodie` |
     * | created_at | time | The date and time (in [ISO 8601
     * format](http://en.wikipedia.org/wiki/ISO_8601)) when the abandoned cart was created. |
     * | email_state | string | Filter by `abandoned_email_state` value. Possible
     * values: `sent`, `not_sent`, `scheduled` and `suppressed`. |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:&lt;=1234` |
     * | recovery_state | string | Possible values: `recovered` and `not_recovered`. |
     * | status | string | Possible values: `open` and `closed`. |
     * | updated_at | time | The date and time (in [ISO 8601
     * format](http://en.wikipedia.org/wiki/ISO_8601)) when the abandoned cart was
     * last updated. |
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

    /**
     * The upper bound on count value before returning a result.
     */
    public Builder limit(Integer limit) {
      this.limit = limit;
      this.fieldsSet.add("limit");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
