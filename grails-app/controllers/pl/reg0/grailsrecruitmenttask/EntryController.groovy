package pl.reg0.grailsrecruitmenttask

class EntryController {

    EntryService entryService
    StatusFlowService statusFlowService

    def index() {
        [entries: entryService.list()]
    }

    def edit(Long id) {
        [entry: BlogEntry.get(id)]
    }

    def saveDraft(String title, String contents) {
        BlogEntry entry = entryService.save(null, title, contents)

        redirect(action: 'edit', id: entry.id)
    }

    def saveAndPublish(Long id, String title, String contents) {
        entryService.save(id, title, contents)
        statusFlowService.publish(id)

        redirect(action: 'index')
    }
}
