/** This program is free: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.entity.User;
import com.user.repository.UserRepository;
import com.user.service.UserService;

/**
 * @author laxman
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	/**
	 * 
	 */
	@Autowired
	UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.system.enquiry.service.UserService#findById(long)
	 */
	@Override
	public User findById(long id) {
		return userRepository.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.system.enquiry.service.UserService#findByEmailId(java.lang.String)
	 */
	@Override
	public User findByEmailId(String emailId) {
		return userRepository.findByEmailId(emailId);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.system.enquiry.service.UserService#saveUser(com.system.enquiry.entity
	 * .User)
	 */
	@Override
	public Long saveUser(User user) {
		return userRepository.save(user).getId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.system.enquiry.service.UserService#updateUser(com.system.enquiry.
	 * entity.User)
	 */
	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.system.enquiry.service.UserService#deleteUserById(long)
	 */
	@Override
	public void deleteUserById(long id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.system.enquiry.service.UserService#findAllUsers()
	 */
	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.system.enquiry.service.UserService#isUserExist(com.system.enquiry.
	 * entity.User)
	 */
	@Override
	public User isUserExist(User user) {
		return userRepository.isUserExist(user.getUserName());
	}

}
