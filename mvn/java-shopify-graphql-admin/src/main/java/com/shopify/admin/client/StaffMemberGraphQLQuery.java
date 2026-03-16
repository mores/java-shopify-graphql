package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Retrieves a [staff
 * member](https://shopify.dev/docs/api/admin-graphql/latest/objects/StaffMember)
 * by ID. If no ID is provided, the query returns the staff member that's making
 * the request. A staff member is a user who can access the Shopify admin to
 * manage store operations.
 *   
 * Provides staff member details such as email, name, and shop owner status. When
 * querying the current user (with or without an ID), additional [private data](https://shopify.dev/docs/api/admin-graphql/latest/queries/staffMember#returns-StaffMember.fields.privateData)
 * becomes available.
 */
public class StaffMemberGraphQLQuery extends GraphQLQuery {
  public StaffMemberGraphQLQuery(String id, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }
  }

  public StaffMemberGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "staffMember";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String queryName;

    public StaffMemberGraphQLQuery build() {
      return new StaffMemberGraphQLQuery(id, queryName, fieldsSet);
               
    }

    /**
     * The ID of the staff member to return. If no ID is provided, then the staff member making the query (if any) is returned.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
