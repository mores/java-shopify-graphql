package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
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
 * Returns the status of a customer merge request job.
 */
public class CustomerMergeJobStatusGraphQLQuery extends GraphQLQuery {
  public CustomerMergeJobStatusGraphQLQuery(String jobId, String queryName, Set<String> fieldsSet) {
    super("query", queryName);
    if (jobId != null || fieldsSet.contains("jobId")) {
        getInput().put("jobId", jobId);
    }
  }

  public CustomerMergeJobStatusGraphQLQuery(String jobId, String queryName, Set<String> fieldsSet,
      Map<String, String> variableReferences, List<VariableDefinition> variableDefinitions) {
    super("query", queryName);
    if (jobId != null || fieldsSet.contains("jobId")) {
        getInput().put("jobId", jobId);
    }
    if(variableDefinitions != null) {
       getVariableDefinitions().addAll(variableDefinitions);
    }

    if(variableReferences != null) {
       getVariableReferences().putAll(variableReferences);
    }                      
  }

  public CustomerMergeJobStatusGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
    return "customerMergeJobStatus";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private final Map<String, String> variableReferences = new HashMap<>();

    private final List<VariableDefinition> variableDefinitions = new ArrayList<>();

    private String jobId;

    private String queryName;

    public CustomerMergeJobStatusGraphQLQuery build() {
      return new CustomerMergeJobStatusGraphQLQuery(jobId, queryName, fieldsSet, variableReferences, variableDefinitions);
               
    }

    /**
     * The ID of the job performing the customer merge request.
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      this.fieldsSet.add("jobId");
      return this;
    }

    /**
     * The ID of the job performing the customer merge request.
     */
    public Builder jobIdReference(String variableRef) {
      this.variableReferences.put("jobId", variableRef);
      this.variableDefinitions.add(graphql.language.VariableDefinition.newVariableDefinition(variableRef, new graphql.language.NonNullType(new graphql.language.TypeName("ID"))).build());
      this.fieldsSet.add("jobId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
