// Exported from:        http://Kenny-Dell:5516/#/templates/Release45a0e2d68dcb4f08bea072fc12944569/releasefile
// XL Release version:   8.2.1
// Date created:         Wed Jan 30 16:33:22 CET 2019

xlr {
  template('Trigger Example') {
    scheduledStartDate Date.parse("yyyy-MM-dd'T'HH:mm:ssZ", '2019-01-30T09:00:00+0100')
    phases {
      phase('New Phase') {
        tasks {
          manual('Doesn\'t matter') {
            
          }
        }
      }
      phase('Phase 2') {
        color '#0099CC'
      }
    }
    releaseTriggers {
      gitPoll('Trigger for Git') {
        releaseTitle 'New Release from Git Poll Trigger'
        gitRepository 'GitHub - kenny1986/supportninja'
      }
      timeSchedule('Trigger Minute') {
        releaseTitle 'asefasdf'
        periodicity '0 * * * * *'
        enabled false
      }
    }
    teams {
      team('Release Admin') {
        permissions 'release#edit_precondition', 'release#edit', 'release#reassign_task', 'release#edit_security', 'release#view', 'release#lock_task', 'release#start', 'release#edit_blackout', 'template#view', 'release#edit_failure_handler', 'release#abort', 'release#edit_task'
      }
      team('Template Owner') {
        members 'admin'
        permissions 'template#edit', 'template#lock_task', 'template#view', 'template#edit_triggers', 'template#edit_precondition', 'template#edit_security', 'template#create_release', 'template#edit_failure_handler'
      }
    }
  }
}