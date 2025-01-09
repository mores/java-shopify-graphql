package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.types.LocationSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns a list of active inventory locations.
 */
public class LocationsGraphQLQuery extends GraphQLQuery {
  public LocationsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, LocationSortKeys sortKey, String query, Boolean includeLegacy,
      Boolean includeInactive, String queryName, Set<String> fieldsSet) {
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
    }if (includeLegacy != null || fieldsSet.contains("includeLegacy")) {
        getInput().put("includeLegacy", includeLegacy);
    }if (includeInactive != null || fieldsSet.contains("includeInactive")) {
        getInput().put("includeInactive", includeInactive);
    }
  }

  public LocationsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "locations";
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

    private LocationSortKeys sortKey;

    private String query;

    private Boolean includeLegacy;

    private Boolean includeInactive;

    private String queryName;

    public LocationsGraphQLQuery build() {
      return new LocationsGraphQLQuery(first, after, last, before, reverse, sortKey, query, includeLegacy, includeInactive, queryName, fieldsSet);
               
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
    public Builder sortKey(LocationSortKeys sortKey) {
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
     * | active | string |
     * | address1 | string |
     * | address2 | string |
     * | city | string |
     * | country | string |
     * | created_at | time |
     * | geolocated | boolean |
     * | id | id | Filter by `id` range. | | | - `id:1234`<br/> - `id:>=1234`<br/> - `id:<=1234` |
     * | legacy | boolean |
     * | location_id | id |
     * | name | string |
     * | pickup_in_store | string | | - `enabled`<br/> - `disabled` |
     * | province | string |
     * | zip | string |
     * You can apply one or more filters to a query. Learn more about [Shopify API
     * search syntax](https://shopify.dev/api/usage/search-syntax).
     */
    public Builder query(String query) {
      this.query = query;
      this.fieldsSet.add("query");
      return this;
    }

    /**
     * Whether to include the legacy locations of fulfillment services.
     */
    public Builder includeLegacy(Boolean includeLegacy) {
      this.includeLegacy = includeLegacy;
      this.fieldsSet.add("includeLegacy");
      return this;
    }

    /**
     * Whether to include the locations that are deactivated.
     */
    public Builder includeInactive(Boolean includeInactive) {
      this.includeInactive = includeInactive;
      this.fieldsSet.add("includeInactive");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
