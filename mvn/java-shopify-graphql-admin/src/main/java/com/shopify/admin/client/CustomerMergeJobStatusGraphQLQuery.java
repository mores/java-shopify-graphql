package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
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

    private String jobId;

    private String queryName;

    public CustomerMergeJobStatusGraphQLQuery build() {
      return new CustomerMergeJobStatusGraphQLQuery(jobId, queryName, fieldsSet);
               
    }

    /**
     * The ID of the job performing the customer merge request.
     */
    public Builder jobId(String jobId) {
      this.jobId = jobId;
      this.fieldsSet.add("jobId");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
