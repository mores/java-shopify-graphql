package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

/**
 * Applies staged changes from an order editing session to the original order.
 * This finalizes all modifications made during the edit session, including
 * changes to line items, quantities, discounts, and shipping lines.
 *   
 * Order editing follows a three-step workflow: start with [`orderEditBegin`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditBegin)
 * to create an editing session, apply changes using various orderEdit mutations,
 * and then save the changes with the [`orderEditCommit`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderEditCommit)
 * mutation. The mutation can optionally notify the customer of changes and add
 * staff notes for internal tracking.
 *   
 * You can only edit unfulfilled line items. If an edit changes the total order
 * value, then the customer might need to pay a balance or receive a refund.
 *   
 * Learn more about [editing existing orders](https://shopify.dev/docs/apps/build/orders-fulfillment/order-management-apps/edit-orders).
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
     * or the order edit session that will have its changes applied to the order.
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
