package com.shopify.storefront.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * All active metaobjects for the shop.
 */
public class MetaobjectsGraphQLQuery extends GraphQLQuery {
  public MetaobjectsGraphQLQuery(String after, String before, Integer first, Integer last,
      Boolean reverse, String sortKey, String type, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (after != null || fieldsSet.contains("after")) {
        getInput().put("after", after);
    }if (before != null || fieldsSet.contains("before")) {
        getInput().put("before", before);
    }if (first != null || fieldsSet.contains("first")) {
        getInput().put("first", first);
    }if (last != null || fieldsSet.contains("last")) {
        getInput().put("last", last);
    }if (reverse != null || fieldsSet.contains("reverse")) {
        getInput().put("reverse", reverse);
    }if (sortKey != null || fieldsSet.contains("sortKey")) {
        getInput().put("sortKey", sortKey);
    }if (type != null || fieldsSet.contains("type")) {
        getInput().put("type", type);
    }
  }

  public MetaobjectsGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "metaobjects";
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

    private Boolean reverse;

    private String sortKey;

    private String type;

    private String queryName;

    public MetaobjectsGraphQLQuery build() {
      return new MetaobjectsGraphQLQuery(after, before, first, last, reverse, sortKey, type, queryName, fieldsSet);
               
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
     * Reverse the order of the underlying list.
     */
    public Builder reverse(Boolean reverse) {
      this.reverse = reverse;
      this.fieldsSet.add("reverse");
      return this;
    }

    /**
     * The key of a field to sort with. Supports "id" and "updated_at".
     */
    public Builder sortKey(String sortKey) {
      this.sortKey = sortKey;
      this.fieldsSet.add("sortKey");
      return this;
    }

    /**
     * The type of metaobject to retrieve.
     */
    public Builder type(String type) {
      this.type = type;
      this.fieldsSet.add("type");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
