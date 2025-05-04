package com.shopify.admin.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * A list of maps that contain `segmentId` IDs and `isMember` Booleans. The maps represent segment memberships.
 */
public class SegmentMembershipResponse {
  /**
   * The membership status for the given list of segments.
   */
  private List<SegmentMembership> memberships;

  public SegmentMembershipResponse() {
  }

  /**
   * The membership status for the given list of segments.
   */
  public List<SegmentMembership> getMemberships() {
    return memberships;
  }

  public void setMemberships(List<SegmentMembership> memberships) {
    this.memberships = memberships;
  }

  @Override
  public String toString() {
    return "SegmentMembershipResponse{memberships='" + memberships + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SegmentMembershipResponse that = (SegmentMembershipResponse) o;
    return Objects.equals(memberships, that.memberships);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberships);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The membership status for the given list of segments.
     */
    private List<SegmentMembership> memberships;

    public SegmentMembershipResponse build() {
      SegmentMembershipResponse result = new SegmentMembershipResponse();
      result.memberships = this.memberships;
      return result;
    }

    /**
     * The membership status for the given list of segments.
     */
    public Builder memberships(List<SegmentMembership> memberships) {
      this.memberships = memberships;
      return this;
    }
  }
}
