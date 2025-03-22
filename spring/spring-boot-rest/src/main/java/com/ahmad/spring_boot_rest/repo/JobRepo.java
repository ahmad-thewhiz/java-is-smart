package com.ahmad.spring_boot_rest.repo;

import java.util.ArrayList;

import com.ahmad.spring_boot_rest.model.JobPost;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}

//// method to return all JobPosts
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//// method to save a job post object into arrayList
//public void addJob(JobPost job) {
//    jobs.add(job);
//    System.out.println(jobs);
//
//}
//
//public JobPost getJobById(int id) {
//    for (JobPost job : jobs) {
//        if(job.getPostId() == id) {
//            return job;
//        }
//    }
//    return null;
//}
//
//public void deleteJobById(int id) {
//    jobs.removeIf(job -> job.getPostId() == id);
//}
//
//public void updateJob(JobPost job) {
//    for (int i = 0; i < jobs.size(); i++) {
//        if (jobs.get(i).getPostId() == job.getPostId()) {
//            jobs.set(i, job);
//            break;
//        }
//    }
//}