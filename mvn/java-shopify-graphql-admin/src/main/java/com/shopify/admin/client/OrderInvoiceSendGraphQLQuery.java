package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.EmailInput;
import graphql.language.VariableDefinition;
import java.lang.Override;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Sends an email invoice for an [`Order`](https://shopify.dev/docs/api/admin-graphql/latest/objects/Order).
 *   
 * You can customize the email recipient, sender, and subject line using the [`email`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderInvoiceSend#arguments-email) argument.
 *   
 * > Note:
 * > Use store or staff account email addresses for the [`from`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderInvoiceSend#arguments-email.fields.from) and [`bcc`](https://shopify.dev/docs/api/admin-graphql/latest/mutations/orderInvoiceSend#arguments-email.fields.bcc) input fields.
 */
public class OrderInvoiceSendGraphQLQuery extends GraphQLQuery {
  public OrderInvoiceSendGraphQLQuery(String id, EmailInput email, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
  }

  public OrderInvoiceSendGraphQLQuery(String id, EmailInput email, String queryName,
      Set<String> fieldsSet, Map<String, String> variableReferences,
      List<VariableDefinition> variableDefinitions) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (email != null || fieldsSet.contains("email")) {
        getInput().put("email", email);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public OrderInvoiceSendGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "orderInvoiceSend";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String id;

    private EmailInput email;

    private String queryName;

    public OrderInvoiceSendGraphQLQuery build() {
      return new OrderInvoiceSendGraphQLQuery(id, email, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The order associated with the invoice.
     */
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The order associated with the invoice.
     */
    public Builder idReference(String variableRef) {
      this.variableReferences.put("id", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("id");
      return this;
    }

    /**
     * The email input fields for the order invoice. The `bcc` and `from` fields should be store or staff account emails.
     */
    public Builder email(EmailInput email) {
      this.email = email;
      this.fieldsSet.add("email");
      return this;
    }

    /**
     * The email input fields for the order invoice. The `bcc` and `from` fields should be store or staff account emails.
     */
    public Builder emailReference(String variableRef) {
      this.variableReferences.put("email", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.TypeName("EmailInput")).build());
      this.fieldsSet.add("email");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
