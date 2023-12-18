![Google Online Assessment logo](Google%20Assesment.png)

# Google Online Assessment Questions

[![GitHub stars](https://img.shields.io/github/stars/YourUsername/YourRepo)](https://github.com/YourUsername/YourRepo/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/YourUsername/YourRepo)](https://github.com/YourUsername/YourRepo/network/members)
[![GitHub watchers](https://img.shields.io/github/watchers/YourUsername/YourRepo)](https://github.com/YourUsername/YourRepo/watchers)
[![GitHub contributors](https://img.shields.io/github/contributors/YourUsername/YourRepo)](https://github.com/YourUsername/YourRepo/graphs/contributors)

A curated collection of Google's Online Assessment Questions, categorized by difficulty and type. Explore problems, descriptions, and solutions for coding challenges used in Google's assessments.

## Problem List

### New Grad

- 🌟 **Min Amplitude:** Calculate and minimize the amplitude of an array.
- 🌟 **Ways to Split String:** Count unique ways to split a string into prime numbers.
- 🌈 **Minimum Domino Rotations For Equal Row:** Determine the minimum rotations needed to make rows of dominoes equal.
- 🌈 **Time to Type a String:** Calculate the time to type a string using a keyboard.

### Intern

- ⭐⭐⭐ **Maximum Time:** Find the maximum time in a 24-hour format.
- 🟡 **Min Abs Difference of Server Loads:** Minimize the absolute difference of server loads.
- ⭐⭐⭐ **Most Booked Hotel Room:** Find the most booked hotel room based on log entries.
- ⭐ **Minimum Domino Rotations For Equal Row:** Determine the minimum rotations needed to make rows of dominoes equal.
- 🟡 **Time to Type a String:** Calculate the time to type a string using a keyboard.
- 🌐 **Maximum Level Sum of a Binary Tree:** Find the maximum level sum of a binary tree.
- 🌐 **Min Number of Chairs:** Calculate the minimum number of chairs needed for an event.
- 🌐 **K Closest Points to Origin:** Find the K closest points to the origin in a 2D plane.
- 🌐 **Odd Even Jump:** Determine if you can reach the end of an array using odd and even jumps.
- 🌐 **License Key Formatting:** Format a license key string.
- 🌐 **Unique Email Addresses:** Count the number of unique email addresses.
- 🍇 **Fruit Into Baskets:** Maximize the number of fruits in two baskets.
- 🍇 **Min Days to Bloom:** Calculate the minimum days needed for flowers to bloom.
- 🍇 **Fill Matrix:** Fill a matrix with values in spiral order.
- 🍇 **Decreasing Subsequences:** Count the number of decreasing subsequences.
- 🍇 **Max Distance:** Find the maximum distance between two numbers.
- 🍇 **Stores and Houses:** Determine the minimum distance between stores and houses.

# Min Amplitude

## Question 1:
Given an Array A, find the minimum amplitude you can get after changing up to 3 elements. Amplitude is the range of the array (basically the difference between the largest and smallest element).

### Example 1:
Input: [-1, 3, -1, 8, 5, 4] <br>
Output: 2 <br>
Explanation: We can change -1, -1, 8 to 3, 4, or 5. <br>

### Example 2:

Input: [10, 10, 3, 4, 10] <br>
Output: 0 <br>
Explanation: Change 3 and 4 to 10. <br>


## Question 2:
Given a string S, we can split S into 2 strings: S1 and S2. Return the number of ways S can be split such that the number of unique characters between S1 and S2 are the same.

### Example 1:
Input: "aaaa"   <br>
Output: 3  <br>
Explanation: We can get a - aaa, aa - aa, aaa - a.  <br>

### Example 2:
Input: "bac"  <br>
Output: 0  <br>

### Example 3:
Input: "ababa"  <br>
Output: 2  <br>
Explanation: ab - aba, aba - ba.  <br> 

# Min Amplitude & Ways to Split String

## Question 1:
Given an Array A, find the minimum amplitude you can get after changing up to 3 elements. Amplitude is the range of the array (basically the difference between the largest and smallest element).

### Example 1:

Input: [-1, 3, -1, 8, 5, 4]  <br> 
Output: 2  <br> 
Explanation: We can change -1, -1, 8 to 3, 4, or 5.  <br> 

### Example 2:

Input: [10, 10, 3, 4, 10]  <br>  
Output: 0  <br> 
Explanation: Change 3 and 4 to 10.  <br> 


## Question 2:
Given a string S, we can split S into 2 strings: S1 and S2. Return the number of ways S can be split such that the number of unique characters between S1 and S2 are the same.

### Example 1:
Input: "aaaa"  <br> 
Output: 3  <br> 
Explanation: We can get a - aaa, aa - aa, aaa - a.  <br> 

### Example 2:
Input: "bac"  <br> 
Output: 0  <br> 

### Example 3:
Input: "ababa" <br> 
Output: 2 <br> 
Explanation: ab - aba, aba - ba. <br> 

# Maximize Time String

You are given a string that represents time in the format hh:mm. Some of the digits are blank (represented by ?). Fill in ? such that the time represented by this string is the maximum possible. Maximum time: 23:59, minimum time: 00:00. You can assume that input string is always valid.

### Example 1:
Input: "?4:5?"  <br> 
Output: "14:59"  <br> 

### Example 2:
Input: "23:5?" <br>
Output: "23:59" <br>

### Example 3:
Input: "2?:22" <br>
Output: "23:22" <br>

### Example 4:
Input: "0?:??" <br>
Output: "09:59" <br>

### Example 5:
Input: "??:??" <br>
Output: "23:59" <br>


# Server Load Balancing

There are some processes that need to be executed. The amount of load that a process causes on a server is represented by a single integer. The total load caused on a server is the sum of the loads of all the processes that run on that server. You have at your disposal two servers, on which the mentioned processes can be run. Your goal is to distribute the given processes between those two servers in a way that the absolute difference of their loads will be minimized.

### Problem Description

Given an array of `n` integers, where each integer represents the load caused by successive processes, return the minimum absolute difference of server loads.

### Example

Input:[1, 2, 3, 4, 5] <br>

Output: <br>
1 <br> 
### Explanation:
We can distribute the processes with loads `[1, 2, 4]` to the first server and `[3, 5]` to the second one so that their total loads will be 7 and 8, respectively. The difference of their loads will be equal to 1.

# Hotel Booking System

Given a hotel which has 10 floors [0-9] and each floor has 26 rooms [A-Z]. You are given a sequence of rooms, where `+` suggests the room is booked, and `-` suggests the room is freed. The task is to find which room is booked the maximum number of times.

## Problem Statement

You may assume that the list describes a correct sequence of bookings in chronological order. That is, only free rooms can be booked, and only booked rooms can be freed. All rooms are initially free. Note that this does not mean that all rooms have to be free at the end. In case two rooms have been booked the same number of times, return the lexographically smaller room.

## Assumptions

- N (length of input) is an integer within the range [1, 600]. <br>
- Each element of array A is a string consisting of three characters: "+" or "-"; a digit "0"-"9"; and uppercase English letter "A" - "Z". <br>
- The sequence is correct. That is, every booked room was previously free, and every freed room was previously booked. <br>

### Example

Input: ["+1A", "+3E", "-1A", "+4F", "+1A", "-3E"] <br>
Output: "1A" <br>
Explanation: Room 1A has been booked 2 times. <br>


# Minimum Domino Rotations For Equal Row

In a row of dominoes, `tops[i]` and `bottoms[i]` represent the top and bottom halves of the ith domino. (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)

We may rotate the ith domino so that `tops[i]` and `bottoms[i]` swap values.

Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same. If it cannot be done, return -1.

## Example

### Example 1:

![Google Online Assessment logo](git.jpeg)  <br>

Input: tops = [2,1,2,4,2,2], bottoms = [5,2,6,2,3,2]  <br>
Output: 2  <br>
Explanation:   <br>
The first figure represents the dominoes as given by tops and bottoms: before we do any rotations.  <br>
If we rotate the second and fourth dominoes, we can make every value in the top row equal to 2, as indicated by the second figure.  <br>

### Example 2:

Input: tops = [3,5,1,2,3], bottoms = [3,6,3,3,4]  <br>
Output: -1  <br>
Explanation:   <br>
In this case, it is not possible to rotate the dominoes to make one row of values equal.  <br>
 
## Constraints

- 2 <= tops.length <= 2 * 10^4  <br>
- bottoms.length == tops.length  <br>
- 1 <= tops[i], bottoms[i] <= 6  <br>

# Single-Row Keyboard Typing

Imagine you have a special keyboard with all keys in a single row. The layout of characters on a keyboard is denoted by a string `keyboard` of length 26. Initially, your finger is at index 0. To type a character, you have to move your finger to the index of the desired character. The time taken to move your finger from index i to index j is `abs(j - i)`.

Given a string `keyboard` that describes the keyboard layout and a string `text`, return an integer denoting the time taken to type the string `text`.

## Example

### Example 1:

Input: keyboard = "abcdefghijklmnopqrstuvwxy", text = "cba"  <br>
Output: 4 <br>
#### Explanation: <br>
Initially, your finger is at index 0. First, you have to type 'c'. The time taken to type 'c' will be abs(2 - 0) = 2 because character 'c' is at index 2. <br>
The second character is 'b', and your finger is now at index 2. The time taken to type 'b' will be abs(1 - 2) = 1 because character 'b' is at index 1. <br>
The third character is 'a', and your finger is now at index 1. The time taken to type 'a' will be abs(0 - 1) = 1 because character 'a' is at index 0. <br>
The total time will therefore be 2 + 1 + 1 = 4. <br>



## Constraints
Length of keyboard will be equal to 26, and all lowercase letters will occur exactly once. <br>
The length of text is within the range [1..100,000]. <br>
String text contains only lowercase letters [a-z]. <br>



# 1161. Maximum Level Sum of a Binary Tree
[Practice here](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/)



# Minimum Number of Chairs Needed

There are n guests who are invited to a party. The k-th guest will attend the party at time S[k] and leave the party at time E[k].

Given an integer array S and an integer array E, both of length n, return an integer denoting the minimum number of chairs you need such that everyone attending the party can sit down.

## Example

### Example:

Input: S = [1, 2, 6, 5, 3], E = [5, 5, 7, 6, 8]  <br>
Output: 3  <br>
#### Explanation:
There are five guests attending the party.   <br>
- The 1st guest will arrive at time 1. We need one chair at time 1.  <br>
- The 2nd guest will arrive at time 2. There are now two guests at the party, so we need two chairs at time 2.  <br>
- The 5th guest will arrive at time 3. There are now three guests at the party, so we need three chairs at time 3.  <br>
- The 4th guest will arrive at time 5, and at the same moment, the 1st and 2nd guests will leave the party.  <br>
  There are now two (the 4th and 5th) guests at the party, so we need two chairs at time 5.  <br>
- The 3rd guest will arrive at time 6, and the 4th guest will leave the party at the same time. <br>
  There are now two (the 3rd and 5th) guests at the party, so we need two chairs at time 6.   <br>
So we need at least 3 chairs.  <br>

