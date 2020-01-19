package com.example.notekeeper

object DataManager {
    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()



    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {

        var course = CourseInfo("android", "android")
        courses.set(course.courseId, course)

        course = CourseInfo("ios", "ios")
        courses.set(course.courseId, course)

        course = CourseInfo( "WorldPress", "WorldPress")
        courses.set(course.courseId, course)

        course = CourseInfo("Bitrix", "Bitrix")
        courses.set(course.courseId, course)

        course = CourseInfo("Angular", "Angular")
        courses.set(course.courseId, course)

        course = CourseInfo("PhotoShop", "PhotoShop")
        courses.set(course.courseId, course)

        course = CourseInfo("HTML", "HTML")
        courses.set(course.courseId, course)

        course = CourseInfo("CSS", "CSS")
        courses.set(course.courseId, course)

        course = CourseInfo("PHP", "PHP")
        courses.set(course.courseId, course)

        course = CourseInfo("Python ", "Python")
        courses.set(course.courseId, course)

        course = CourseInfo("Kotlin", "Kotlin")
        courses.set(course.courseId, course)

        course = CourseInfo("Swift", "Swift")
        courses.set(course.courseId, course)

    }

    private fun initializeNotes(){
        var note = NoteInfo (CourseInfo("android", "android"), "Славик", "Учит" )
        notes.add(note)
        note = NoteInfo (CourseInfo("ios", " ios"), "Арсен", "Учит" )
        notes.add(note)
        note = NoteInfo (CourseInfo("WorldPress", "WorldPress"), "Славик", "Делает сайт Barlock" )
        notes.add(note)
        note = NoteInfo (CourseInfo("Kotlin", "Kotlin"), "Славик", "Учит" )
        notes.add(note)
        note = NoteInfo (CourseInfo("Swift", "Swift"), "Арсен", "Учит" )
        notes.add(note)
        note = NoteInfo (CourseInfo("Bitrix", "Bitrix"), "Русик", "Закончи работать нав ХИПУ" )
        notes.add(note)
        note = NoteInfo (CourseInfo("PHP", "PHP"), "Славик", "Leverage variable-length parameter lists" )
        notes.add(note)
        note = NoteInfo (CourseInfo("Angular", "Angular"), "Алан", "Создает сайт для садиков" )
        notes.add(note)
        note = NoteInfo (CourseInfo("PhotoShop", "PhotoShop"), "Алан", "Редактирует фотки дверей для сайта Barlock" )
        notes.add(note)
        note = NoteInfo (CourseInfo("Angular", "Angular"), "Олег", "Создает сайт для IT-Center" )
        notes.add(note)
        note = NoteInfo (CourseInfo("Python ", "Python"), "Русик", "Учит" )
        notes.add(note)


    }


}