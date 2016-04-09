package pl.reg0.grailsrecruitmenttask

class EntryController {

    EntryService entryService

    def index(String filter) {
        [entries: filter ? entryService.filter(filter) : entryService.list()]
    }

}
