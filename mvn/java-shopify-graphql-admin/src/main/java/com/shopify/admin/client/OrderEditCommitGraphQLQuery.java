package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Applies and saves staged changes to an order. Mutations are operating on `OrderEdit`.
 * All order edits start with `orderEditBegin`, have any number of `orderEdit`*
 * mutations made, and end with `orderEditCommit`.
 */
public class OrderEditCommitGraphQLQuery extends GraphQLQuery {
  public OrderEditCommitGraphQLQuery(String id, Boolean notifyCustomer, String staffNote,
      String queryName, Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (notifyCustomer != null || fieldsSet.contains("notifyCustomer")) {
        getInput().put("notifyCustomer", notifyCustomer);
    }if (staffNote != null || fieldsSet.contains("staffNote")) {
        getInput().put("staffNote", staffNote);
    }
  }

  public OrderEditCommitGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderEditCommit";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private Boolean notifyCustomer;

    private String staffNote;

    private String queryName;

    public OrderEditCommitGraphQLQuery build() {
      return new OrderEditCommitGraphQLQuery(id, notifyCustomer, staffNote, queryName, fieldsSet);
               
    }

    /**
     * The ID of the [calculated order](https://shopify.dev/api/admin-graphql/latest/objects/calculatedorder)
     * that will have its changes applied to the order.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * Whether to notify the customer or not.
     */
    public Builder notifyCustomer(Boolean notifyCustomer) {
      this.notifyCustomer = notifyCustomer;
      this.fieldsSet.add("notifyCustomer");
      return this;
    }

    /**
     * Note for staff members.
     */
    public Builder staffNote(String staffNote) {
      this.staffNote = staffNote;
      this.fieldsSet.add("staffNote");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
