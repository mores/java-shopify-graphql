package com.shopify.admin.types;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A rollout on a shop. Merchants use rollouts to run sales events, permanent
 * launches, and A/B tests by serving treatments to a configured share of buyers.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Rollout implements com.shopify.admin.types.Node {
  /**
   * The date and time at which the rollout was archived.
   */
  private OffsetDateTime archivedAt;

  /**
   * The actual conclusion date and time of the rollout for public API requests.
   * Use `schedule.concludeAt` for the planned conclusion date.
   */
  private OffsetDateTime concludedAt;

  /**
   * The date and time at which the rollout was created.
   */
  private OffsetDateTime createdAt;

  /**
   * The calculated percentage of new buyer traffic allocated to this rollout after
   * accounting for other active rollouts competing for the same traffic.
   */
  private double effectiveTrafficAllocation;

  /**
   * The ID of the rollout.
   */
  private String id;

  /**
   * The name of the rollout.
   */
  private String name;

  /**
   * The rollout's planned activation and conclusion dates. Returns null when neither date is set.
   */
  private RolloutSchedule schedule;

  /**
   * The actual start date and time of the rollout for public API requests. Use
   * `schedule.activateAt` for the planned activation date.
   */
  private OffsetDateTime startedAt;

  /**
   * The status of the rollout.
   */
  private RolloutStatus status;

  /**
   * The percentage of buyer traffic that the rollout is configured to receive, as
   * an integer from 0 to 100. This is the configured allocation before other
   * active rollouts competing for the same traffic are taken into account, so it
   * isn't the share of buyers that a treatment reaches.
   */
  private int trafficAllocation;

  /**
   * The treatments of the rollout. Control treatments are included even when they have no changes.
   */
  private List<RolloutTreatment> treatments;

  /**
   * The date and time at which the rollout was last edited. This timestamp doesn't
   * necessarily change when another rollout changes this rollout's effective
   * traffic allocation.
   */
  private OffsetDateTime updatedAt;

  public Rollout() {
  }

  /**
   * The date and time at which the rollout was archived.
   */
  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }

  /**
   * The actual conclusion date and time of the rollout for public API requests.
   * Use `schedule.concludeAt` for the planned conclusion date.
   */
  public OffsetDateTime getConcludedAt() {
    return concludedAt;
  }

  public void setConcludedAt(OffsetDateTime concludedAt) {
    this.concludedAt = concludedAt;
  }

  /**
   * The date and time at which the rollout was created.
   */
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * The calculated percentage of new buyer traffic allocated to this rollout after
   * accounting for other active rollouts competing for the same traffic.
   */
  public double getEffectiveTrafficAllocation() {
    return effectiveTrafficAllocation;
  }

  public void setEffectiveTrafficAllocation(double effectiveTrafficAllocation) {
    this.effectiveTrafficAllocation = effectiveTrafficAllocation;
  }

  /**
   * The ID of the rollout.
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The name of the rollout.
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * The rollout's planned activation and conclusion dates. Returns null when neither date is set.
   */
  public RolloutSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(RolloutSchedule schedule) {
    this.schedule = schedule;
  }

  /**
   * The actual start date and time of the rollout for public API requests. Use
   * `schedule.activateAt` for the planned activation date.
   */
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  /**
   * The status of the rollout.
   */
  public RolloutStatus getStatus() {
    return status;
  }

  public void setStatus(RolloutStatus status) {
    this.status = status;
  }

  /**
   * The percentage of buyer traffic that the rollout is configured to receive, as
   * an integer from 0 to 100. This is the configured allocation before other
   * active rollouts competing for the same traffic are taken into account, so it
   * isn't the share of buyers that a treatment reaches.
   */
  public int getTrafficAllocation() {
    return trafficAllocation;
  }

  public void setTrafficAllocation(int trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
  }

  /**
   * The treatments of the rollout. Control treatments are included even when they have no changes.
   */
  public List<RolloutTreatment> getTreatments() {
    return treatments;
  }

  public void setTreatments(List<RolloutTreatment> treatments) {
    this.treatments = treatments;
  }

  /**
   * The date and time at which the rollout was last edited. This timestamp doesn't
   * necessarily change when another rollout changes this rollout's effective
   * traffic allocation.
   */
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Rollout{archivedAt='" + archivedAt + "', concludedAt='" + concludedAt + "', createdAt='" + createdAt + "', effectiveTrafficAllocation='" + effectiveTrafficAllocation + "', id='" + id + "', name='" + name + "', schedule='" + schedule + "', startedAt='" + startedAt + "', status='" + status + "', trafficAllocation='" + trafficAllocation + "', treatments='" + treatments + "', updatedAt='" + updatedAt + "'}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Rollout that = (Rollout) o;
    return Objects.equals(archivedAt, that.archivedAt) &&
        Objects.equals(concludedAt, that.concludedAt) &&
        Objects.equals(createdAt, that.createdAt) &&
        effectiveTrafficAllocation == that.effectiveTrafficAllocation &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(schedule, that.schedule) &&
        Objects.equals(startedAt, that.startedAt) &&
        Objects.equals(status, that.status) &&
        trafficAllocation == that.trafficAllocation &&
        Objects.equals(treatments, that.treatments) &&
        Objects.equals(updatedAt, that.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archivedAt, concludedAt, createdAt, effectiveTrafficAllocation, id, name, schedule, startedAt, status, trafficAllocation, treatments, updatedAt);
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * The date and time at which the rollout was archived.
     */
    private OffsetDateTime archivedAt;

    /**
     * The actual conclusion date and time of the rollout for public API requests.
     * Use `schedule.concludeAt` for the planned conclusion date.
     */
    private OffsetDateTime concludedAt;

    /**
     * The date and time at which the rollout was created.
     */
    private OffsetDateTime createdAt;

    /**
     * The calculated percentage of new buyer traffic allocated to this rollout after
     * accounting for other active rollouts competing for the same traffic.
     */
    private double effectiveTrafficAllocation;

    /**
     * The ID of the rollout.
     */
    private String id;

    /**
     * The name of the rollout.
     */
    private String name;

    /**
     * The rollout's planned activation and conclusion dates. Returns null when neither date is set.
     */
    private RolloutSchedule schedule;

    /**
     * The actual start date and time of the rollout for public API requests. Use
     * `schedule.activateAt` for the planned activation date.
     */
    private OffsetDateTime startedAt;

    /**
     * The status of the rollout.
     */
    private RolloutStatus status;

    /**
     * The percentage of buyer traffic that the rollout is configured to receive, as
     * an integer from 0 to 100. This is the configured allocation before other
     * active rollouts competing for the same traffic are taken into account, so it
     * isn't the share of buyers that a treatment reaches.
     */
    private int trafficAllocation;

    /**
     * The treatments of the rollout. Control treatments are included even when they have no changes.
     */
    private List<RolloutTreatment> treatments;

    /**
     * The date and time at which the rollout was last edited. This timestamp doesn't
     * necessarily change when another rollout changes this rollout's effective
     * traffic allocation.
     */
    private OffsetDateTime updatedAt;

    public Rollout build() {
      Rollout result = new Rollout();
      result.archivedAt = this.archivedAt;
      result.concludedAt = this.concludedAt;
      result.createdAt = this.createdAt;
      result.effectiveTrafficAllocation = this.effectiveTrafficAllocation;
      result.id = this.id;
      result.name = this.name;
      result.schedule = this.schedule;
      result.startedAt = this.startedAt;
      result.status = this.status;
      result.trafficAllocation = this.trafficAllocation;
      result.treatments = this.treatments;
      result.updatedAt = this.updatedAt;
      return result;
    }

    /**
     * The date and time at which the rollout was archived.
     */
    public Builder archivedAt(OffsetDateTime archivedAt) {
      this.archivedAt = archivedAt;
      return this;
    }

    /**
     * The actual conclusion date and time of the rollout for public API requests.
     * Use `schedule.concludeAt` for the planned conclusion date.
     */
    public Builder concludedAt(OffsetDateTime concludedAt) {
      this.concludedAt = concludedAt;
      return this;
    }

    /**
     * The date and time at which the rollout was created.
     */
    public Builder createdAt(OffsetDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    /**
     * The calculated percentage of new buyer traffic allocated to this rollout after
     * accounting for other active rollouts competing for the same traffic.
     */
    public Builder effectiveTrafficAllocation(double effectiveTrafficAllocation) {
      this.effectiveTrafficAllocation = effectiveTrafficAllocation;
      return this;
    }

    /**
     * The ID of the rollout.
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The name of the rollout.
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * The rollout's planned activation and conclusion dates. Returns null when neither date is set.
     */
    public Builder schedule(RolloutSchedule schedule) {
      this.schedule = schedule;
      return this;
    }

    /**
     * The actual start date and time of the rollout for public API requests. Use
     * `schedule.activateAt` for the planned activation date.
     */
    public Builder startedAt(OffsetDateTime startedAt) {
      this.startedAt = startedAt;
      return this;
    }

    /**
     * The status of the rollout.
     */
    public Builder status(RolloutStatus status) {
      this.status = status;
      return this;
    }

    /**
     * The percentage of buyer traffic that the rollout is configured to receive, as
     * an integer from 0 to 100. This is the configured allocation before other
     * active rollouts competing for the same traffic are taken into account, so it
     * isn't the share of buyers that a treatment reaches.
     */
    public Builder trafficAllocation(int trafficAllocation) {
      this.trafficAllocation = trafficAllocation;
      return this;
    }

    /**
     * The treatments of the rollout. Control treatments are included even when they have no changes.
     */
    public Builder treatments(List<RolloutTreatment> treatments) {
      this.treatments = treatments;
      return this;
    }

    /**
     * The date and time at which the rollout was last edited. This timestamp doesn't
     * necessarily change when another rollout changes this rollout's effective
     * traffic allocation.
     */
    public Builder updatedAt(OffsetDateTime updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }
  }
}
