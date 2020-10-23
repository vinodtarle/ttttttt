package com.kidgeneration.school.kg.module.constant

import android.util.SparseArray
import android.util.SparseIntArray
import com.kidgeneration.school.kg.R

class Constant {
    companion object {
        const val MODULE_PER_ROW = 3

        const val MODULE_NUMBER_ACTIVITY = 1
        const val MODULE_NUMBER_ADMISSION = 2
        const val MODULE_NUMBER_ALERT = 3
        const val MODULE_NUMBER_ATTENDANCE = 4

        const val MODULE_NUMBER_BRANCH = 11

        const val MODULE_NUMBER_CERTIFICATE = 21
        const val MODULE_NUMBER_COMPLAINT = 22
        const val MODULE_NUMBER_COURSE = 23

        const val MODULE_NUMBER_DAYCARE = 31
        const val MODULE_NUMBER_DIARY = 32
        const val MODULE_NUMBER_DIVISION = 33
        const val MODULE_NUMBER_DRIVER = 34

        const val MODULE_NUMBER_ENQUIRY = 41
        const val MODULE_NUMBER_EVENT = 42
        const val MODULE_NUMBER_EXAM = 43

        const val MODULE_NUMBER_FEES = 51

        const val MODULE_NUMBER_GALLERY = 61

        const val MODULE_NUMBER_HOMEWORK = 71

        const val MODULE_NUMBER_INVENTORY = 81
        const val MODULE_NUMBER_ISSUE = 82

        const val MODULE_NUMBER_J = 91

        const val MODULE_NUMBER_K = 101

        const val MODULE_NUMBER_LEAVE = 111
        const val MODULE_NUMBER_LIBRARY = 112

        //const val MODULE_NUMBER_MATERIAL = 121
        const val MODULE_NUMBER_MEETING = 122
        //const val MODULE_NUMBER_MESSAGE = 123

        const val MODULE_NUMBER_NOTICE = 131
        const val MODULE_NUMBER_NOTIFICATION = 132

        const val MODULE_NUMBER_O = 141

        const val MODULE_NUMBER_P = 151

        const val MODULE_NUMBER_Q = 161

        const val MODULE_NUMBER_RESULT = 171
        const val MODULE_NUMBER_ROLE = 172
        const val MODULE_NUMBER_ROUTE = 173

        //const val MODULE_NUMBER_SCHOOL = 181
        const val MODULE_NUMBER_STAFF = 182
        const val MODULE_NUMBER_STANDARD = 183
        const val MODULE_NUMBER_STOP = 184
        const val MODULE_NUMBER_STUDENT = 185
        const val MODULE_NUMBER_SUBJECT = 186
        //const val MODULE_NUMBER_SYLLABUS = 287

        const val MODULE_TIME_TABLE_NUMBER = 191

        //const val MODULE_NUMBER_TOPIC = 192
        const val MODULE_TRANSPORT_NUMBER = 193

        const val MODULE_NUMBER_U = 201
        const val MODULE_NUMBER_V = 211
        const val MODULE_NUMBER_W = 221
        const val MODULE_NUMBER_X = 231
        const val MODULE_NUMBER_Y = 241
        const val MODULE_NUMBER_Z = 251

        const val MODULE_ACTIVITY = "Activity"
        const val MODULE_ADMISSION = "Admission"
        const val MODULE_ALERT = "Alert"
        const val MODULE_ATTENDANCE = "Attendance"
        const val MODULE_BRANCH = "Branch"
        const val MODULE_CERTIFICATE = "Certificate"
        const val MODULE_COMPLAINT = "Complaint"
        const val MODULE_COURSE = "Course"
        const val MODULE_DAYCARE = "Daycare"
        const val MODULE_DIARY = "Diary"
        const val MODULE_DIVISION = "Division"
        const val MODULE_DRIVER = "Driver"
        const val MODULE_ENQUIRY = "Enquiry"
        const val MODULE_EVENT = "Event"
        const val MODULE_EXAM = "Exam"
        const val MODULE_FEES = "Fees"
        const val MODULE_GALLERY = "Gallery"
        const val MODULE_HOMEWORK = "Homework"
        const val MODULE_INVENTORY = "Inventory"
        const val MODULE_ISSUE = "Issue"
        const val MODULE_LEAVE = "Leave"
        const val MODULE_LIBRARY = "Library"
        const val MODULE_MATERIAL = "Material"
        const val MODULE_MEETING = "Meeting"
        const val MODULE_MESSAGE = "Message"
        const val MODULE_MODULE = "Module"
        const val MODULE_MODULES = "Modules"
        const val MODULE_NOTICE = "Notice"
        const val MODULE_NOTIFICATION = "Notification"
        const val MODULE_RESULT = "Result"
        const val MODULE_ROLE = "Role"
        const val MODULE_ROUTE = "Route"
        const val MODULE_SCHOOL = "School"
        const val MODULE_STAFF = "Staff"
        const val MODULE_STANDARD = "Standard"
        const val MODULE_STOP = "Stop"
        const val MODULE_STUDENT = "Student"
        const val MODULE_SUBJECT = "Subject"
        const val MODULE_SYLLABUS = "Syllabus"
        const val MODULE_TIME_TABLE = "TimeTable"
        const val MODULE_TOPIC = "Topic"
        const val MODULE_TRANSPORT = "Transport"
        const val MODULE_TRACKING = "Tracking"
        const val MODULE_VEHICLES = "Vehicles"

        private const val SIZE = 35
        val modules: SparseArray<String> = SparseArray(SIZE)
        val moduleBackground = SparseIntArray(SIZE)
        val moduleSelected = SparseIntArray(SIZE)
        val moduleIcon = SparseIntArray(SIZE)
        val moduleIconColor = SparseIntArray(SIZE)

        init {
            this.modules.put(MODULE_NUMBER_ACTIVITY, MODULE_ACTIVITY)
            this.modules.put(MODULE_NUMBER_ADMISSION, MODULE_ADMISSION)
            this.modules.put(MODULE_NUMBER_ALERT, MODULE_ALERT)
            this.modules.put(MODULE_NUMBER_ATTENDANCE, MODULE_ATTENDANCE)
            this.modules.put(MODULE_NUMBER_BRANCH, MODULE_BRANCH)
            this.modules.put(MODULE_NUMBER_CERTIFICATE, MODULE_CERTIFICATE)
            this.modules.put(MODULE_NUMBER_COMPLAINT, MODULE_COMPLAINT)
            this.modules.put(MODULE_NUMBER_COURSE, MODULE_COURSE)
            this.modules.put(MODULE_NUMBER_DAYCARE, MODULE_DAYCARE)
            this.modules.put(MODULE_NUMBER_DIARY, MODULE_DIARY)
            this.modules.put(MODULE_NUMBER_DIVISION, MODULE_DIVISION)
            this.modules.put(MODULE_NUMBER_DRIVER, MODULE_DRIVER)
            this.modules.put(MODULE_NUMBER_ENQUIRY, MODULE_ENQUIRY)
            this.modules.put(MODULE_NUMBER_EVENT, MODULE_EVENT)
            this.modules.put(MODULE_NUMBER_EXAM, MODULE_EXAM)
            this.modules.put(MODULE_NUMBER_FEES, MODULE_FEES)
            this.modules.put(MODULE_NUMBER_GALLERY, MODULE_GALLERY)
            this.modules.put(MODULE_NUMBER_HOMEWORK, MODULE_HOMEWORK)
            this.modules.put(MODULE_NUMBER_INVENTORY, MODULE_INVENTORY)
            this.modules.put(MODULE_NUMBER_ISSUE, MODULE_ISSUE)
            this.modules.put(MODULE_NUMBER_LEAVE, MODULE_LEAVE)
            this.modules.put(MODULE_NUMBER_LIBRARY, MODULE_LIBRARY)
            this.modules.put(MODULE_NUMBER_MEETING, MODULE_MEETING)
            this.modules.put(MODULE_NUMBER_NOTICE, MODULE_NOTICE)
            this.modules.put(MODULE_NUMBER_NOTIFICATION, MODULE_NOTIFICATION)
            this.modules.put(MODULE_NUMBER_RESULT, MODULE_RESULT)
            this.modules.put(MODULE_NUMBER_ROLE, MODULE_ROLE)
            this.modules.put(MODULE_NUMBER_ROUTE, MODULE_ROUTE)
            this.modules.put(MODULE_NUMBER_STAFF, MODULE_STAFF)
            this.modules.put(MODULE_NUMBER_STANDARD, MODULE_STANDARD)
            this.modules.put(MODULE_NUMBER_STOP, MODULE_STOP)
            this.modules.put(MODULE_NUMBER_STUDENT, MODULE_STUDENT)
            this.modules.put(MODULE_NUMBER_SUBJECT, MODULE_SUBJECT)
            this.modules.put(MODULE_TIME_TABLE_NUMBER, MODULE_TIME_TABLE)
            this.modules.put(MODULE_TRANSPORT_NUMBER, MODULE_TRANSPORT)

            this.moduleBackground.put(MODULE_NUMBER_ACTIVITY, R.drawable.style_module_activity)
            this.moduleBackground.put(MODULE_NUMBER_ADMISSION, R.drawable.style_module_admission)
            this.moduleBackground.put(MODULE_NUMBER_ALERT, R.drawable.style_module_alert)
            this.moduleBackground.put(MODULE_NUMBER_ATTENDANCE, R.drawable.style_module_attendance)
            this.moduleBackground.put(MODULE_NUMBER_BRANCH, R.drawable.style_module_branch)
            this.moduleBackground.put(
                MODULE_NUMBER_CERTIFICATE,
                R.drawable.style_module_certificate
            )
            this.moduleBackground.put(MODULE_NUMBER_COMPLAINT, R.drawable.style_module_complaint)
            this.moduleBackground.put(MODULE_NUMBER_COURSE, R.drawable.style_module_course)
            this.moduleBackground.put(MODULE_NUMBER_DAYCARE, R.drawable.style_module_daycare)
            this.moduleBackground.put(MODULE_NUMBER_DIARY, R.drawable.style_module_diary)
            this.moduleBackground.put(MODULE_NUMBER_DIVISION, R.drawable.style_module_division)
            this.moduleBackground.put(MODULE_NUMBER_DRIVER, R.drawable.style_module_driver)
            this.moduleBackground.put(MODULE_NUMBER_ENQUIRY, R.drawable.style_module_enquiry)
            this.moduleBackground.put(MODULE_NUMBER_EVENT, R.drawable.style_module_event)
            this.moduleBackground.put(MODULE_NUMBER_EXAM, R.drawable.style_module_exam)
            this.moduleBackground.put(MODULE_NUMBER_FEES, R.drawable.style_module_fees)
            this.moduleBackground.put(MODULE_NUMBER_GALLERY, R.drawable.style_module_gallery)
            this.moduleBackground.put(MODULE_NUMBER_HOMEWORK, R.drawable.style_module_homework)
            this.moduleBackground.put(MODULE_NUMBER_INVENTORY, R.drawable.style_module_inventory)
            this.moduleBackground.put(MODULE_NUMBER_ISSUE, R.drawable.style_module_issue)
            this.moduleBackground.put(MODULE_NUMBER_LEAVE, R.drawable.style_module_leave)
            this.moduleBackground.put(MODULE_NUMBER_LIBRARY, R.drawable.style_module_library)
            this.moduleBackground.put(MODULE_NUMBER_MEETING, R.drawable.style_module_meeting)
            this.moduleBackground.put(MODULE_NUMBER_NOTICE, R.drawable.style_module_notice)
            this.moduleBackground.put(
                MODULE_NUMBER_NOTIFICATION,
                R.drawable.style_module_notification
            )
            this.moduleBackground.put(MODULE_NUMBER_RESULT, R.drawable.style_module_result)
            this.moduleBackground.put(MODULE_NUMBER_ROLE, R.drawable.style_module_role)
            this.moduleBackground.put(MODULE_NUMBER_ROUTE, R.drawable.style_module_route)
            this.moduleBackground.put(MODULE_NUMBER_STAFF, R.drawable.style_module_staff)
            this.moduleBackground.put(MODULE_NUMBER_STANDARD, R.drawable.style_module_standard)
            this.moduleBackground.put(MODULE_NUMBER_STOP, R.drawable.style_module_stop)
            this.moduleBackground.put(MODULE_NUMBER_STUDENT, R.drawable.style_module_student)
            this.moduleBackground.put(MODULE_NUMBER_SUBJECT, R.drawable.style_module_subject)
            this.moduleBackground.put(MODULE_TIME_TABLE_NUMBER, R.drawable.style_module_time_table)
            this.moduleBackground.put(MODULE_TRANSPORT_NUMBER, R.drawable.style_module_transport)

            this.moduleSelected.put(MODULE_NUMBER_ACTIVITY, R.drawable.style_module_activity_select)
            this.moduleSelected.put(
                MODULE_NUMBER_ADMISSION,
                R.drawable.style_module_admission_select
            )
            this.moduleSelected.put(MODULE_NUMBER_ALERT, R.drawable.style_module_alert_select)
            this.moduleSelected.put(
                MODULE_NUMBER_ATTENDANCE,
                R.drawable.style_module_attendance_select
            )
            this.moduleSelected.put(MODULE_NUMBER_BRANCH, R.drawable.style_module_branch_select)
            this.moduleSelected.put(
                MODULE_NUMBER_CERTIFICATE,
                R.drawable.style_module_certificate_select
            )
            this.moduleSelected.put(
                MODULE_NUMBER_COMPLAINT,
                R.drawable.style_module_complaint_select
            )
            this.moduleSelected.put(MODULE_NUMBER_COURSE, R.drawable.style_module_course_select)
            this.moduleSelected.put(MODULE_NUMBER_DAYCARE, R.drawable.style_module_daycare_select)
            this.moduleSelected.put(MODULE_NUMBER_DIARY, R.drawable.style_module_diary_select)
            this.moduleSelected.put(MODULE_NUMBER_DIVISION, R.drawable.style_module_division_select)
            this.moduleSelected.put(MODULE_NUMBER_DRIVER, R.drawable.style_module_driver_select)
            this.moduleSelected.put(MODULE_NUMBER_ENQUIRY, R.drawable.style_module_enquiry_select)
            this.moduleSelected.put(MODULE_NUMBER_EVENT, R.drawable.style_module_event_select)
            this.moduleSelected.put(MODULE_NUMBER_EXAM, R.drawable.style_module_exam_select)
            this.moduleSelected.put(MODULE_NUMBER_FEES, R.drawable.style_module_fees_select)
            this.moduleSelected.put(MODULE_NUMBER_GALLERY, R.drawable.style_module_gallery_select)
            this.moduleSelected.put(MODULE_NUMBER_HOMEWORK, R.drawable.style_module_homework_select)
            this.moduleSelected.put(
                MODULE_NUMBER_INVENTORY,
                R.drawable.style_module_inventory_select
            )
            this.moduleSelected.put(MODULE_NUMBER_ISSUE, R.drawable.style_module_issue_select)
            this.moduleSelected.put(MODULE_NUMBER_LEAVE, R.drawable.style_module_leave_select)
            this.moduleSelected.put(MODULE_NUMBER_LIBRARY, R.drawable.style_module_library_select)
            this.moduleSelected.put(MODULE_NUMBER_MEETING, R.drawable.style_module_meeting_select)
            this.moduleSelected.put(MODULE_NUMBER_NOTICE, R.drawable.style_module_notice_select)
            this.moduleSelected.put(
                MODULE_NUMBER_NOTIFICATION,
                R.drawable.style_module_notification_select
            )
            this.moduleSelected.put(MODULE_NUMBER_RESULT, R.drawable.style_module_result_select)
            this.moduleSelected.put(MODULE_NUMBER_ROLE, R.drawable.style_module_role_select)
            this.moduleSelected.put(MODULE_NUMBER_ROUTE, R.drawable.style_module_route_select)
            this.moduleSelected.put(MODULE_NUMBER_STAFF, R.drawable.style_module_staff_select)
            this.moduleSelected.put(MODULE_NUMBER_STANDARD, R.drawable.style_module_standard_select)
            this.moduleSelected.put(MODULE_NUMBER_STOP, R.drawable.style_module_stop_select)
            this.moduleSelected.put(MODULE_NUMBER_STUDENT, R.drawable.style_module_student_select)
            this.moduleSelected.put(MODULE_NUMBER_SUBJECT, R.drawable.style_module_subject_select)
            this.moduleSelected.put(
                MODULE_TIME_TABLE_NUMBER,
                R.drawable.style_module_time_table_select
            )
            this.moduleSelected.put(
                MODULE_TRANSPORT_NUMBER,
                R.drawable.style_module_transport_select
            )

            this.moduleIcon.put(MODULE_NUMBER_ACTIVITY, R.drawable.ic_module_activity)
            this.moduleIcon.put(MODULE_NUMBER_ADMISSION, R.drawable.ic_module_admission)
            this.moduleIcon.put(MODULE_NUMBER_ALERT, R.drawable.ic_module_alert)
            this.moduleIcon.put(MODULE_NUMBER_ATTENDANCE, R.drawable.ic_module_attendance)
            this.moduleIcon.put(MODULE_NUMBER_BRANCH, R.drawable.ic_module_branch)
            this.moduleIcon.put(MODULE_NUMBER_CERTIFICATE, R.drawable.ic_module_certificate)
            this.moduleIcon.put(MODULE_NUMBER_COMPLAINT, R.drawable.ic_module_complaint)
            this.moduleIcon.put(MODULE_NUMBER_COURSE, R.drawable.ic_module_course)
            this.moduleIcon.put(MODULE_NUMBER_DAYCARE, R.drawable.ic_module_daycare)
            this.moduleIcon.put(MODULE_NUMBER_DIARY, R.drawable.ic_module_diary)
            this.moduleIcon.put(MODULE_NUMBER_DIVISION, R.drawable.ic_module_division)
            this.moduleIcon.put(MODULE_NUMBER_DRIVER, R.drawable.ic_module_driver)
            this.moduleIcon.put(MODULE_NUMBER_ENQUIRY, R.drawable.ic_module_enquiry)
            this.moduleIcon.put(MODULE_NUMBER_EVENT, R.drawable.ic_module_event)
            this.moduleIcon.put(MODULE_NUMBER_EXAM, R.drawable.ic_module_exam)
            this.moduleIcon.put(MODULE_NUMBER_FEES, R.drawable.ic_module_fees)
            this.moduleIcon.put(MODULE_NUMBER_GALLERY, R.drawable.ic_module_gallery)
            this.moduleIcon.put(MODULE_NUMBER_HOMEWORK, R.drawable.ic_module_homework)
            this.moduleIcon.put(MODULE_NUMBER_INVENTORY, R.drawable.ic_module_inventory)
            this.moduleIcon.put(MODULE_NUMBER_ISSUE, R.drawable.ic_module_issue)
            this.moduleIcon.put(MODULE_NUMBER_LEAVE, R.drawable.ic_module_leave)
            this.moduleIcon.put(MODULE_NUMBER_LIBRARY, R.drawable.ic_module_library)
            this.moduleIcon.put(MODULE_NUMBER_MEETING, R.drawable.ic_module_meeting)
            this.moduleIcon.put(MODULE_NUMBER_NOTICE, R.drawable.ic_module_notice)
            this.moduleIcon.put(MODULE_NUMBER_NOTIFICATION, R.drawable.ic_module_notifications)
            this.moduleIcon.put(MODULE_NUMBER_RESULT, R.drawable.ic_module_result)
            this.moduleIcon.put(MODULE_NUMBER_ROLE, R.drawable.ic_module_role)
            this.moduleIcon.put(MODULE_NUMBER_ROUTE, R.drawable.ic_module_route)
            this.moduleIcon.put(MODULE_NUMBER_STAFF, R.drawable.ic_module_staff)
            this.moduleIcon.put(MODULE_NUMBER_STANDARD, R.drawable.ic_module_standard)
            this.moduleIcon.put(MODULE_NUMBER_STOP, R.drawable.ic_module_stop)
            this.moduleIcon.put(MODULE_NUMBER_STUDENT, R.drawable.ic_module_student)
            this.moduleIcon.put(MODULE_NUMBER_SUBJECT, R.drawable.ic_module_subject)
            this.moduleIcon.put(MODULE_TIME_TABLE_NUMBER, R.drawable.ic_module_time_table)
            this.moduleIcon.put(MODULE_TRANSPORT_NUMBER, R.drawable.ic_module_transport)

            this.moduleIconColor.put(MODULE_NUMBER_ACTIVITY, R.color.moduleActivity)
            this.moduleIconColor.put(MODULE_NUMBER_ADMISSION, R.color.moduleAdmission)
            this.moduleIconColor.put(MODULE_NUMBER_ALERT, R.color.moduleAlert)
            this.moduleIconColor.put(MODULE_NUMBER_ATTENDANCE, R.color.moduleAttendance)
            this.moduleIconColor.put(MODULE_NUMBER_BRANCH, R.color.moduleBranch)
            this.moduleIconColor.put(MODULE_NUMBER_CERTIFICATE, R.color.moduleCertificate)
            this.moduleIconColor.put(MODULE_NUMBER_COMPLAINT, R.color.moduleComplaint)
            this.moduleIconColor.put(MODULE_NUMBER_COURSE, R.color.moduleCourse)
            this.moduleIconColor.put(MODULE_NUMBER_DAYCARE, R.color.moduleDaycare)
            this.moduleIconColor.put(MODULE_NUMBER_DIARY, R.color.moduleDiary)
            this.moduleIconColor.put(MODULE_NUMBER_DIVISION, R.color.moduleDivision)
            this.moduleIconColor.put(MODULE_NUMBER_DRIVER, R.color.moduleDriver)
            this.moduleIconColor.put(MODULE_NUMBER_ENQUIRY, R.color.moduleEnquiry)
            this.moduleIconColor.put(MODULE_NUMBER_EVENT, R.color.moduleEvent)
            this.moduleIconColor.put(MODULE_NUMBER_EXAM, R.color.moduleExam)
            this.moduleIconColor.put(MODULE_NUMBER_FEES, R.color.moduleFees)
            this.moduleIconColor.put(MODULE_NUMBER_GALLERY, R.color.moduleGallery)
            this.moduleIconColor.put(MODULE_NUMBER_HOMEWORK, R.color.moduleHomework)
            this.moduleIconColor.put(MODULE_NUMBER_INVENTORY, R.color.moduleInventory)
            this.moduleIconColor.put(MODULE_NUMBER_ISSUE, R.color.moduleIssue)
            this.moduleIconColor.put(MODULE_NUMBER_LEAVE, R.color.moduleLeave)
            this.moduleIconColor.put(MODULE_NUMBER_LIBRARY, R.color.moduleLibrary)
            this.moduleIconColor.put(MODULE_NUMBER_MEETING, R.color.moduleMeeting)
            this.moduleIconColor.put(MODULE_NUMBER_NOTICE, R.color.moduleNotice)
            this.moduleIconColor.put(MODULE_NUMBER_NOTIFICATION, R.color.moduleNotification)
            this.moduleIconColor.put(MODULE_NUMBER_RESULT, R.color.moduleResult)
            this.moduleIconColor.put(MODULE_NUMBER_ROLE, R.color.moduleRole)
            this.moduleIconColor.put(MODULE_NUMBER_ROUTE, R.color.moduleRoute)
            this.moduleIconColor.put(MODULE_NUMBER_STAFF, R.color.moduleStaff)
            this.moduleIconColor.put(MODULE_NUMBER_STANDARD, R.color.moduleStandard)
            this.moduleIconColor.put(MODULE_NUMBER_STOP, R.color.moduleStop)
            this.moduleIconColor.put(MODULE_NUMBER_STUDENT, R.color.moduleStudent)
            this.moduleIconColor.put(MODULE_NUMBER_SUBJECT, R.color.moduleSubject)
            this.moduleIconColor.put(MODULE_TIME_TABLE_NUMBER, R.color.moduleTimeTable)
            this.moduleIconColor.put(MODULE_TRANSPORT_NUMBER, R.color.moduleTransport)
        }
    }

    /*const val MODULE_ACTIVITIES = "Activities"
        const val MODULE_ADMISSION = "Admission"
        const val MODULE_ALERT = "Alert"
        const val MODULE_ATTENDANCE = "Attendance"
        const val MODULE_BRANCH = "Branch"
        const val MODULE_CERTIFICATE = "Certificate"
        const val MODULE_COMPLAINT = "Complaint"
        const val MODULE_COURSE = "Course"
        const val MODULE_DAYCARE = "Daycare"
        const val MODULE_DIARY = "DIARY"
        const val MODULE_DIVISION = "DIVISION"
        const val MODULE_DRIVER = "Driver"
        const val MODULE_ENQUIRY = "Enquiry"
        const val MODULE_EVENT = "Event"
        const val MODULE_EXAM = "Exam"
        const val MODULE_FEES = "Fees"
        const val MODULE_GALLERY = "Gallery"
        const val MODULE_HOMEWORK = "Homework"
        const val MODULE_INVENTORY = "Inventory"
        const val MODULE_ISSUE = "Issue"
        const val MODULE_LEAVE = "Leave"
        const val MODULE_MATERIAL = "Material"
        const val MODULE_MEETING = "Meeting"
        const val MODULE_MESSAGE = "Message"
        const val MODULE_NOTICE = "Notice"
        const val MODULE_NOTIFICATION = "Notification"
        const val MODULE_RESULT = "Result"
        const val MODULE_ROUTE = "Route"
        const val MODULE_SCHOOL = "School"
        const val MODULE_STAFF = "Staff"
        const val MODULE_STANDARD = "Standard"
        const val MODULE_STOP = "Stop"
        const val MODULE_STUDENT = "Student"
        const val MODULE_SUBJECT = "Subject"
        const val MODULE_SYLLABUS = "Syllabus"
        const val MODULE_TIME_TABLE = "TimeTable"
        const val MODULE_TOPIC = "Topic"
        const val MODULE_TRANSPORT = "Transport"
        const val MODULE_TRACKING = "Tracking"*/

    /*
     Activities
     Admission
     Alert
     Attendance
     Branch
     Certificate
     Complaint
     Course
     Daycare
     Driver
     Enquiry
     Event
     Exam
     Fees
     Image
     Homework
     Inventory
     Issue
     Leave
     Material
     Meeting
     Message
     Notice
     Result
     Route
     School
     Staff
     Stop
     Student
     Subject
     Syllabus
     TimeTable
     Topic*/
}