package com.shopify.admin.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import com.shopify.admin.types.StagedUploadInput;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Creates staged upload targets for each input. This is the first step in the upload process.
 * The returned staged upload targets' URL and parameter fields can be used to send a request
 * to upload the file described in the corresponding input.
 *   
 * For more information on the upload process, refer to
 * [Upload media to Shopify](https://shopify.dev/apps/online-store/media/products#step-1-upload-media-to-shopify).
 */
public class StagedUploadsCreateGraphQLQuery extends GraphQLQuery {
  public StagedUploadsCreateGraphQLQuery(List<StagedUploadInput> input, String queryName,
      Set<String> fieldsSet) {
    super("mutation", queryName);
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public StagedUploadsCreateGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
    return "stagedUploadsCreate";
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private List<StagedUploadInput> input;

    private String queryName;

    public StagedUploadsCreateGraphQLQuery build() {
      return new StagedUploadsCreateGraphQLQuery(input, queryName, fieldsSet);
               
    }

    /**
     * The information required to generate staged upload targets.
     */
    public Builder input(List<StagedUploadInput> input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }

    public Builder queryName(String queryName) {
      this.queryName = queryName;
      return this;
    }
  }
}
