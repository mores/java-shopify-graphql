package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.storefront.types.GeoCoordinateInput;
import com.shopify.storefront.types.LocationSortKeys;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * List of the shop's locations that support in-store pickup.
 *   
 * When sorting by distance, you must specify a location via the `near` argument.
 */
public class LocationsGraphQLQuery extends GraphQLQuery {
  public LocationsGraphQLQuery(Integer first, String after, Integer last, String before,
      Boolean reverse, LocationSortKeys sortKey, GeoCoordinateInput near, String queryName,
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
    }if (near != null || fieldsSet.contains("near")) {
        getInput().put("near", near);
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

    private GeoCoordinateInput near;

    private String queryName;

    public LocationsGraphQLQuery build() {
      return new LocationsGraphQLQuery(first, after, last, before, reverse, sortKey, near, queryName, fieldsSet);
               
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
    public Builder sortKey(LocationSortKeys sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * Used to sort results based on proximity to the provided location.
     */
    public Builder near(GeoCoordinateInput near) {
      this.near = near;
      this.fieldsSet.add("near");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
