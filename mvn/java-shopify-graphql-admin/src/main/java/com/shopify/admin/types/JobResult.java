package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.String;

/**
 * A job corresponds to some long running task that the client should poll for status.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "__typename"
)
@JsonSubTypes(@JsonSubTypes.Type(value = CustomerSegmentMembersQuery.class, name = "CustomerSegmentMembersQuery"))
public interface JobResult {
  /**
   * This indicates if the job is still queued or has been run.
   */
  boolean getDone();

  /**
   * A globally-unique ID that's returned when running an asynchronous mutation.
   */
  String getId();
}
