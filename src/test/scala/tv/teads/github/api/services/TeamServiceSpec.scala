package tv.teads.github.api.services

import tv.teads.github.api.BaseSpec

import scala.concurrent.ExecutionContext.Implicits.global

class TeamServiceSpec extends BaseSpec {

  "Team Service" should "be able to fetch an organization teams" in {

    whenReady(TeamService.fetchOrgTeams("ebuzzing")) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch default organization teams" in {

    whenReady(TeamService.fetchDefaultOrgTeams) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch teams member" in {

    whenReady(TeamService.fetchTeamMembers(1276819)) { list ⇒
      list should not be empty
    }
  }
  it should "be able to fetch a team" in {

    whenReady(TeamService.fetchTeam(1276819)) { list ⇒
      list should not be empty
    }
  }

}
