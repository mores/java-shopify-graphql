package com.shopify.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;


public class FlowGenerateSignatureGraphQLQuery extends GraphQLQuery {
  public FlowGenerateSignatureGraphQLQuery(String id, String payload, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (id != null || fieldsSet.contains("id")) {
        getInput().put("id", id);
    }if (payload != null || fieldsSet.contains("payload")) {
        getInput().put("payload", payload);
    }
  }

  public FlowGenerateSignatureGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "flowGenerateSignature";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private String id;

    private String payload;

    private String queryName;

    public FlowGenerateSignatureGraphQLQuery build() {
      return new FlowGenerateSignatureGraphQLQuery(id, payload, queryName, fieldsSet);
               
    }

    
    public Builder id(String id) {
      this.id = id;
      this.fieldsSet.add("id");
      return this;
    }

    
    public Builder payload(String payload) {
      this.payload = payload;
      this.fieldsSet.add("payload");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
